package org.example;

import net.datafaker.Faker;

public class ExceptionDemo {
    public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            int numerator = 10;
            int denominator = faker.random().nextInt(2);
            System.out.println("分母為:" + denominator);
            int result;
            try {
                result = divide(1, 3);
            } catch (ArithmeticException e) {
                result = 0; // result預設值為0
//                System.out.println("除數不得為0");

            }
            System.out.println("計算結果為:" + result);
        }
        System.out.println("程式繼續執行");
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            throw e;
        }
        return result;
    }
}