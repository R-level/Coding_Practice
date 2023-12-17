package Multiples_of_3_or_5;

public class Multiple_Of_3_or_5 {
    public static void main(String[] args) {
       System.out.println(sumMultiples(1000,3,5));

    }

    private static int sumMultiples(int limit, int multiple1, int multiple2) {
        int sum = 0;
        for (int i = 1; i < limit; i++) {
            if ((i%multiple1==0)||(i%multiple2==0)) {
                sum+=i;
            }
        }
        return sum;
    }
}
