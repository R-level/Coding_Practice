package Poker_Hands;

import java.io.*;

public class Poker_Hands {
    /**
     * The poker hands will be ranked as follows
     * 1  = High Card: Highest value card.
     * 2  = One Pair: Two cards of the same value.
     * 3  = Two Pairs: Two different pairs.
     * 4  = Three of a Kind: Three cards of the same value.
     * 5  = Straight: All cards are consecutive values.
     * 6  = Flush: All cards of the same suit.
     * 7  = Full House: Three of a kind and a pair.
     * 8  = Four of a Kind: Four cards of the same value.
     * 9  = Straight Flush: All cards are consecutive values of same suit.
     * 10 = Royal Flush: Ten, Jack, Queen, King, Ace, in same suit.*/

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader(new File("C:\\Users\\remle\\OneDrive\\Documents\\GitHub\\Coding_Practice\\Problems\\Project_Euler\\src\\Poker_Hands\\poker.txt")));
        String hands = read.readLine();
        System.out.println(hands);
        String player1 = hands.substring(0,14);
        String player2 = hands.substring(15,29);
        rankTheHand(player1.split(" "));
       // rankTheHand(player2.split(" "));

    }
    public static int rankTheHand(String[]hand){
        String value="";
        String suit="";
    for(String s:hand){
       value = s.substring(0,1);

       suit = s.substring(1,2);
        System.out.print(value+" "+suit+"  ");

    }

        return 1;
    }
}
