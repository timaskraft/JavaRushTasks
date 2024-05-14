package com.javarush.task.pro.task15.task1527;

import java.io.*;
import java.util.Scanner;

/* 
 Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
            FileReader fileReader = new FileReader(scanner.nextLine());
             BufferedReader reader = new BufferedReader(fileReader)) {
            int counter = 0;
            while (reader.ready()) {
                String line = reader.readLine();
                if (counter % 2 == 0) {
                    System.out.println(line);
                }
                counter++;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}