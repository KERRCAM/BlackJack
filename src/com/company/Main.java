package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

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
    int CardDrawn = random.nextInt(52);
    System.out.println(CardDrawn);
    System.out.println(cards[CardDrawn]);



    }
}
