package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    int cards[] = new int[53];
    for (int i = 1; i < 11; i++) {
        for (int j = 1; j < 5; j++) {
            cards[i] = i;
        }
    }

    for (int i = 41; i <53; i++) {
        int JacksQueensKings = 10;
        cards[i] = JacksQueensKings;
    }


    Random random  = new Random();
    Scanner input = new Scanner(System.in);
    int CardDrawn = random.nextInt(52);
    //System.out.println(CardDrawn);
    //System.out.println(cards[CardDrawn]);

    for (int i = 0; i <53 ; i++) {
        System.out.println(cards[i]);
    }


    }
}