package Remove_Duplicates;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        int pointer=1;
        int maxNumber = nums[0]; //0

        for(int n=1;n<nums.length;n++){
            if(nums[n]>maxNumber){
                maxNumber=nums[n];
                nums[pointer]=maxNumber;
                pointer++;

            }
        }
        return pointer;
    }

    public static void main(String[] args) {
        int k = removeDuplicates(new int[]{1,1,2});
    }
}
