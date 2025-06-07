package org.example;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        //提示:
        // 1. BMI公式: 體重(kg) / (身高(m)/2)
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入您的身高(cm):");
        double height = scanner.nextDouble();
        height = height / 100;
        System.out.println("請輸入您的體重(Kg):");
        double weight = scanner.nextDouble();
        double BMI = (weight / (height * height));
        System.out.println("請輸入BMI:" + BMI);
        int result;
        boolean a = BMI < 18.5;
        boolean b = BMI < 24;
        // 2. 條件
        if (a) {
            result = 1;
        } else if (b) {
            result = 2;
        } else {
            result = 3;
        }

        switch (result) {
            case 1:
                System.out.print("過輕");
                break;
            case 2:
                System.out.print("正常");
                break;
            case 3:
                System.out.print("過重");
                break;

        }

    }
}


