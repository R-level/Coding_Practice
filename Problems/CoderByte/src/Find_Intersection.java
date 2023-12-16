import java.util.*;

public class Find_Intersection {

        public static String FindIntersection(String[] strArr) {
            // a list for containing the arrays of Strings
            ArrayList<List<String>> list = new ArrayList<>();
            //Smallest size array
            int min=Integer.MAX_VALUE;
            //For every string in the strArr
            for(String s:strArr){

                String[] numberList = s.split(", ");
                //Find min which is  the smallest length of all the arrays.
                if(numberList.length<min){
                    min = numberList.length;
                }
                list.add(Arrays.asList(numberList));
            }

            //Create a new result list
            //List<String> result = new ArrayList<String>();
            StringBuilder result = new StringBuilder("");
            //Find matches between the lists
            for(int i=0;i<min;i++){
                if(list.get(1).contains(list.get(0).get(i))){
                    //result.add(list.get(0).get(i));
                    result.append(list.get(0).get(i));

                    if(i!=min-1){
                        result.append(",");
                    }
                }
            }
            //Take the results together and create a string
            return result.toString();
        }

        public static void main (String[] args) {

            System.out.print(FindIntersection(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}));
        }
}
