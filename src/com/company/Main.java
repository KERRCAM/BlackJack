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
    int IndexCardDrawnOne = random.nextInt(52);
    int CardDrawnOne = cards[IndexCardDrawnOne];
    int IndexCardDrawnTwo = random.nextInt(52);
    int CardDrawnTwo = cards[IndexCardDrawnTwo];
    int UserTotal = (CardDrawnOne + CardDrawnTwo);
    System.out.println("you drew a " + CardDrawnOne + " and a " + CardDrawnTwo + ". Your total is: " + UserTotal);

    boolean UserTurn = false;
    while(UserTurn == false) {
        System.out.println("would you like to drawn again? (1 for yes or 0 for no): ");
        int DrawAgain = input.nextInt();
        if (DrawAgain == 1) {
            int IndexCardDrawnExtra = random.nextInt(52);
            int CardDrawnExtra = cards[IndexCardDrawnExtra];
            UserTotal = UserTotal + CardDrawnExtra;
            System.out.println("you drew a " + CardDrawnExtra);
            System.out.println("your new total is " + UserTotal);
            UserDraws = UserDraws+1;
        }
        if (DrawAgain == 0) {
            UserTurn = true;
            System.out.println("your final total is " + UserTotal);
        }
    }

    int IndexCompCardDrawnOne = random.nextInt(52);
    int CompCardDrawnOne = cards[IndexCompCardDrawnOne];
    int IndexCompCardDrawnTwo = random.nextInt(52);
    int CompCardDrawnTwo = cards[IndexCompCardDrawnTwo];
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

    if (CompScore > UserScore) {
        System.out.println("well done the computer had a total of " + CompTotal + " so with your total of " + UserTotal + " you win");
    }

    if (CompScore < UserScore) {
        System.out.println("with the computers total of " + CompTotal + " and your total of " + UserTotal + " you lose");
    }

    if (CompScore == UserScore) {
        System.out.println("both you and the computer got a total of " + CompTotal + " so its a draw");
    }



    }
}
