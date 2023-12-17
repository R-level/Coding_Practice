package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        long prev = 0;
        long current = 1;
        long sum = 0;
        long next=0;
        while(next<4000000){

           next  = prev+current;
            if(next%2==0){
                sum+=next;

            }
            prev = current;
            current = next;

        }
        System.out.println(sum);
    }
}
