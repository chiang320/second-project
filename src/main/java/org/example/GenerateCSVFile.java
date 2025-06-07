package org.example;

import net.datafaker.Faker;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class GenerateCSVFile {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String fileName = "user.csv";
        int numberOfUser = 100;


        try (
//                FileWriter fileWriter = new FileWriter(fileName);
                FileOutputStream fileOutputStream = new FileOutputStream(fileName);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, UTF_8);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            bufferedWriter.write("名字, Email, 電話號碼");
            bufferedWriter.newLine();
            for (int i = 0; i < numberOfUser; i++) {
                String name = faker.name().fullName();
                String email = faker.internet().emailAddress();
                String phone = faker.phoneNumber().phoneNumber();

                bufferedWriter.write(String.format("%s,%s,%s", name, email, phone));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("檔案寫入時發生錯誤:" + e.getMessage());
        }
    }
}
