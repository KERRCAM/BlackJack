package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
    int cards[] = new int[53];
    int l = 0;
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 4; j++) {
            cards[l] = i+1;
            l++;

        }
    }

    for (int i = 40; i <52; i++) {
        int JacksQueensKings = 10;
        cards[i] = JacksQueensKings;
    }

    Random random  = new Random();
    Scanner input = new Scanner(System.in);
    int UserDraws = 2;
    int CardDrawnOne = random.nextInt(52);
    int CardDrawnTwo = random.nextInt(52);
    int UserTotal = (CardDrawnOne + CardDrawnTwo);
    System.out.println("you drew a " + CardDrawnOne + " and a " + CardDrawnTwo + ". Your total is: " + UserTotal);

    boolean UserTurn = false;
    while(UserTurn == false) {
        System.out.println("would you like to drawn again? (yes or no): ");
        String DrawAgain = input.nextLine();
        if (DrawAgain == "yes") {
            int CardDrawnExtra = random.nextInt(52);
            UserTotal = UserTotal + CardDrawnExtra;
            System.out.println("your new total is " + UserTotal);
            UserDraws = UserDraws+1;
        }
        if (DrawAgain == "no") {
            System.out.println("your final total is " + UserTotal);
            UserTurn = true;
        }
    }

    int CompCardDrawnOne = random.nextInt(52);
    int CompCardDrawnTwo = random.nextInt(52);
    int CompTotal = (CompCardDrawnOne + CompCardDrawnTwo);
    int UserScore = 0;
    int CompScore = 0;

    if (UserTotal > 21) {
        UserScore = (UserTotal - 21);
    }
    if (UserTotal < 21) {
        UserScore = (21 - UserTotal);
    }

    if (CompTotal > 21) {
        CompScore = (CompTotal - 21);
    }
    if (CompTotal < 21) {
        CompScore = (21 - CompTotal);
    }

    if (CompTotal > UserTotal) {
        System.out.println("well done the computer had a total of " + CompTotal + " so with your total of " + UserTotal + " you win");
    }

    if (CompTotal < UserTotal) {
        System.out.println("with the computers total of " + CompTotal + " and your total of " + UserTotal + " you lose");
    }

    if (CompTotal == UserTotal) {
        System.out.println("bpth you and the computer got a total of " + CompTotal + "so its a draw");
    }



    }
}
