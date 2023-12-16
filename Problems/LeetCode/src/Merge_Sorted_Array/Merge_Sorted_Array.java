package Merge_Sorted_Array;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public class Merge_Sorted_Array {

    /**Time compelxity must aim to be O(m+n) where m=the number of non-zero elements
     * in nums1 and
     * n= the number of non-zero elements in nums2*/
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1; //keep track of the last non-zero elements in nums1
        int j = n-1; //keep track of elemnts from the end of nums2
        int k = m+n-1; //keep track of elements

            while (j >= 0) {
                if (i >= 0 && nums1[i] > nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            }
      //  for (int l = 0; l < nums1.length; l++) {
      //      System.out.print(nums1[l]);
      //  }
        }


    public static void main(String[] args) {
       merge(new int[]{1, 2, 3, 0, 0, 0},3,new int[]{2,5,6},3);
    }

}