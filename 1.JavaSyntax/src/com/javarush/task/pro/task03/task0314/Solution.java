package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

        System.out.println( (pass.toLowerCase().equals(secret.toLowerCase())?"доступ разрешен": "доступ запрещен"));

        //System.out.println("доступ разрешен");
        //напишите тут ваш код
        //System.out.println("доступ запрещен");
    }
}
