package Remove_Element;

public class Remove_Element {
    public static void main(String[] args) {
        int[] nums = new int[]{2,81,5,6,2,3,2,5};
        int val =2;
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {
        //SOLUTION Found on LEETCODE
        int index = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
        //MY CODE writes all val items to the end of the array
      /*  int j = nums.length-1;
        int i = 0;
        int k = nums.length;
        while(j>=i){
            if(nums[i]==val){
                while(nums[j]==val){
                    j--;
                    k--;
                }
                if(j>i){
                nums[i]=nums[j];
                nums[j]=val;
                i++;
                j--;
                k--;
                continue;}
            }
            i++;
        }

        return k;*/
    }

}
