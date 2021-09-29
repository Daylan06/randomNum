package com.company;

import java.util.Scanner;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //   Random random = new Random();
        //   System.out.println("First Random int is " + random.nextInt(10));
        //   System.out.println("First Random double is " + random.nextDouble());

        //   int min = 0;
        //   int max = 100;
        //   int newRandom = random.nextInt((max - min) + 1) + min;
        //  System.out.println(newRandom);

        //    int rand = (int) (Math.random() *10);
        //    System.out.println(rand);

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many sides does your dice have");
        int sides = input.nextInt();
        System.out.println("How many times do you want to throw the dice");
        int diceThrows = input.nextInt();


        for (int i = 0; i <= diceThrows; i++) {
            int rand = (int) ((random.nextInt(sides)) *10);
            System.out.println("Throw" + i + "landed on side" + rand);
        }



        }


    }


}

