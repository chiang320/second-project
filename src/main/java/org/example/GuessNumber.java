package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int guess = 0;
        final int MAX_ATTAMPTS = 5;


        System.out.println("GuessNumber: Game started!!!");

        do {
            System.out.print("請輸入你的猜測（100）: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("太小了！");
            } else if (guess > secret) {
                System.out.println("太大了！");

            }
            System.out.println("剩餘次數" + (MAX_ATTAMPTS - attempts));
        } while (guess != secret && attempts < MAX_ATTAMPTS);

        if (guess == secret) {
            System.out.println("猜對了!!你嘗試了:" + attempts + "次");
        } else {
            System.out.println("GuessNumber: Game over!!!正確數字為" + secret);


        }
    }
}
