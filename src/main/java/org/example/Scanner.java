package org.example;

public class Scanner {
    public static void main(String[] args) {
//提示:
        // 1. 使用Scanner獲取輸入年份
        // 2. 閏年條件 : 能被4整除但不能被100整除，或能被400整除
        // 3. 用if-else 輸出結果
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("請輸入年分");
        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();
            System.out.print("正確收到年份為閏年:" + year);
            if (year % 4==0 && year % 100 != 0  || year % 400 == 0 ) {
                System.out.println("是閏年");
            }
        }else {
            System.out.println("不是閏年");

            //關閉Scanner(良好習慣)
            scanner.close();
        }
    }
}
