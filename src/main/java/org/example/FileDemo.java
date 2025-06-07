package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileDemo {
    public static <IDException> void main(String[] args) {
        System.out.println("正常執行");
        String path = "";
        //Exception 受檢
//        FileReader reader = new FileReader(path);
//        reader.close();
        System.out.println("檔案讀取錯誤");

        String numberStr = "1231231rrrr";
        int number;
//        Runtime Exception
        number = Integer.parseInt(numberStr);
        System.out.println(number);
//    }
//}
    }
}