package Largest_Palindrom_Product;

public class LargestPalindromeProduct {

    public static void main(String[] args) {
        int multiple1 = 999;
        int multiple2 = 999;
        int palindrome =0;
        int product =0;
        while(multiple1>100){
            product = multiple1*multiple2;
            if(isItAPalindrome(String.valueOf(product))){
                if(product>palindrome){
                palindrome = product;
                    System.out.println("The palindrome is "+palindrome+" and m1= "+multiple1+" and m2="+multiple2);}

            }
            multiple2--;
            if(multiple2==99){
                multiple1--;
                multiple2=multiple1;
            }
        }
        System.out.println("The Largest Palindrome is "+palindrome);
    }

    private static boolean isItAPalindrome(String product) {
        int i = 0;
        int j = product.length()-1;
        while(i<j){
            if(product.charAt(i)!=product.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
