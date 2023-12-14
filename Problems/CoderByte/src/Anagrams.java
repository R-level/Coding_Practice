import java.io.*;
import java.util.*;

public class Anagrams {
    public static void main (String[] args) {

        try{

//Reading from a text file.
            BufferedReader b = new BufferedReader( new FileReader(new File("text.txt")));
            String a = b.readLine();

            String[] str = a.split(",");

            Hashtable<String,List<String>> anagramGroups = new Hashtable<>();
            //List for result of anagrams
            List<List<String>> listedAnagrams = new ArrayList<>();

            for(String s:str){
                char[] charArray= s.toCharArray();

                //sort the char array
                Arrays.sort(charArray);
                //check matching Keys
                String checkKey= String.valueOf(charArray);

                if(!anagramGroups.containsKey(checkKey)){

                    anagramGroups.put(checkKey,new ArrayList<String>() );
                    anagramGroups.get(checkKey).add(s);
                }
                else{
                    anagramGroups.get(checkKey).add(s);
                }
            }
            listedAnagrams.addAll(anagramGroups.values());

            //Find the biggerst group of anagrams
            int max=0;
            for(List<String> anagramList: listedAnagrams)
            {
                if(max<anagramList.size()){
                    max = anagramList.size();
                }
            }
//Print groups of anagrams that have the same size.
            for(int i=1;i<=max;i++)
            { System.out.print(i+": ");
                for(int j = 0; j<listedAnagrams.size();j++){
                    if(listedAnagrams.get(j).size()==i){
                        System.out.print(listedAnagrams.get(j)+" ");
                    }
                }
                System.out.println();
            }

        }catch(Exception e){
            System.out.print(e);
        }
        //Possible improvements: Create a comparitor class that compares ArrayList sizes.
        //
    }
}
