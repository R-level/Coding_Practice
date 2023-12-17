package LargestPrimeFactor;

import java.math.BigInteger;

public class LargestPrimeFactor {


    public static void main(String[] args) {
        long number = 600851475143L;

        //long number = 50;
       long maxPrime = 0;

    long prime=2;
      while(number>=prime){
          if( number % prime == 0  &&  prime % 2 != 0){
              maxPrime=prime;
              number = number/prime;
          }
          prime++;
      }
      if(maxPrime==0){
          System.out.println("No prime since "+number+" is prime");
      }else{
        System.out.println("The largest prime factor is: "+maxPrime);}
        //Start with 3 and find out if it is a prime factor of number
       /* while (i < number / 2) {
            if (isItPrime(i)) {
                if (isItDecimal(Double.parseDouble(String.valueOf(number / i)))){
                maxPrime = i;
                }
            }
            i++;
        }
        System.out.println(maxPrime);*/
    }
    private static boolean isItDecimal(double l) {
       if(l==0){
        return true;}
       else{
        return false;}
    }

    private static boolean isItPrime(long i) {
        int j=1;
        while(i/2>j){
            if((i%j)==0&&i!=1){//check for multiples
                return false;
            }
            j++;
        }
        return true;
    }
}
