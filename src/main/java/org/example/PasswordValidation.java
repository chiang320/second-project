package org.example;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("請輸入密碼: ");
        if (scanner.hasNext()) {
            String pwd = scanner.next().trim();
            if (pwd.length() > 20 || pwd.length() < 8) {
                //密碼長度限制
                throw new RuntimeException("自定義:長度限制不符");
            }
            //密碼的格式驗證 必須有大小寫英文(最小程度使用)
            String regex = "(.*[a-z].*)" + "(.*[A-Z].*)";
            if (!pwd.matches(regex)) {
                throw new RuntimeException("密碼格式驗證不符");
            }
            System.out.println("最終顯示密碼為:" + pwd);
        }
    }
}
