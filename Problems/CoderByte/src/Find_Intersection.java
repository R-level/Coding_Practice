import java.util.*;

import static java.util.stream.Collectors.toCollection;

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
            result = findMatches(list, min, result);
            //Take the results together and create a string
            return result.toString();
        }

    private static StringBuilder findMatches(ArrayList<List<String>> list, int min, StringBuilder result) {
        for(int i = 0; i< min; i++){
            if(list.get(1).contains(list.get(0).get(i))){
                //result.add(list.get(0).get(i));
                result.append(list.get(0).get(i));

                if(i!= min -1){
                    result.append(",");
                }
            }
        }
        return result;
    }

    //Answer found at https://coderbyte.com/solution/Find%20Intersection
    public static String FindIntersectionv2(String[] strArr) {
        TreeSet<Integer> set1 = Arrays.stream(strArr[0].replace(" ", "").split(",")).map(Integer::parseInt).collect(toCollection(TreeSet::new));
        TreeSet<Integer> set2 = Arrays.stream(strArr[1].replace(" ", "").split(",")).map(Integer::parseInt).collect(toCollection(TreeSet::new));
        set1.retainAll(set2);

        return (set1.isEmpty() ? "false" : Arrays.toString(new TreeSet<>(set1).toArray()).replace("]", "").replace("[", "").replace(" ", ""));
    }

        public static void main (String[] args) {

            System.out.println(FindIntersection(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}));
            System.out.println(FindIntersectionv2(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}));

        }
}
