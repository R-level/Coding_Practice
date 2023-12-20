package SpiralSquare;
import java.util.*;
import java.io.*;

public class SpiralSquare {

        /**int m (>= 3 and <= 7)
         int n (>= 3 and <= 7)
         int seed (>= 1 and <= 51)

         5 x 3 number spiral
         1  2  3
         12 13 4
         11 14 5
         10 15 6
         9   8 7


         3 x 3
         1 2 3
         8 9 4
         7 6 5

         3 x 7 number spiral
         1 2 3  4 5  6  7
         16 17 18 19 20 21 8
         15 14 13 12 11 10 9
         */
        public static void main (String[] args) {

            int seed=0;
            int m = 5; //rows
            int n = 7; //columns

            String[][]square = createMagicSquare(seed,n,m);
            printSquare(square);
        }

        public static String[][] createMagicSquare(int seed,int columns, int rows){
            //Intution:
            /**For every 3rd side read the square / rectangle gets smaller*/
            int countSides=0;

            String [][] square = new String[rows][columns];
            int elements = rows*columns;
            int e = rows*columns;
            //pointers
            int i=0;
            int j=0;
            int beginRowLimit=0;
            int beginColumnLimit=0;
            int sideCount = 0;

            while(elements!=0){


                //Start of left to right row
                if(i==beginRowLimit&&j==beginColumnLimit){//row=3 col=2

                    while(j<=columns-1){
                        square[i][j++]=String.valueOf(seed);
                        seed++;
                        elements--;
                    }

                    sideCount++;
                }

                //go down column
                else if(i==beginRowLimit&&j==columns){
                    j--;
                    i=beginRowLimit+1;
                    while(i<=rows-1){
                        square[i++][j]=String.valueOf(seed);
                        seed++;
                        elements--;
                    }
                    sideCount++;

                    j++;

                }


                //if we get to end of column
                //go up current rows
                else if(i==rows&&j==columns){
                    j=j-2;
                    i--;
                    while(j>=beginColumnLimit){
                        square[i][j--]=String.valueOf(seed);
                        seed++;
                        elements--;
                    }
                    sideCount++;
                    i++;
                    j++;
                    if(sideCount==3)
                    {//decrement the dimensions
                        rows--;
                        columns--;
                        beginRowLimit++;
                        beginColumnLimit++;
                        sideCount=0;
                    }
                }
                //if we get to row begin
                //go up current column
                else if(i==rows+1&&j==beginColumnLimit-1){
                    i=i-2;
                    while(i>=beginRowLimit){
                        square[i--][j]=String.valueOf(seed);
                        seed++;
                        elements--;
                    }
                    i++;
                    j++;
                    //if count = 3 we will decrement the dimensions.

                }
            }
            return square;
        }

        public static void printSquare(String[][]square){
            for(int i = 0; i<square.length;i++){
                System.out.println(Arrays.toString(square[i]));
            }

        }
    }

