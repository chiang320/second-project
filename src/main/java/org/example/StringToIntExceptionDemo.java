package org.example;

public class StringToIntExceptionDemo {
    public static void main(String[] args) {
        String numberStr = "1231231aa";
        int number;

        try {
            number = Integer.parseInt(numberStr);
            System.out.println("轉換後數字為:" + number);
        } catch (AbstractMethodError e) {
            System.out.println("計算錯誤");
        } catch (NumberFormatException e) {
            System.out.println("無法將字串專為數字");
        }
    }
}
