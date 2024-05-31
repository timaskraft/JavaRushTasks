package com.javarush.task.jdk13.task06.task0626;

import java.util.Scanner;

/* 
Первая база данных
*/

public class Solution {
    public static String[][] array = new String[][]{{"123", "Иванов", "Богдан"},
                                                    {"1425", "Петрова", "Марина"},
                                                    {"37", "Богдан", "Андрей"},
                                                    {"98", "Богданова", "Марина"},
                                                    {"6285", "Прутко", "Сергей"},
                                                    {"8", "Клочкова", "Елена"},
                                                    {"754", "Котов", "Иван"}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        for (String[] strings : array) {
            if (strings[0].equals(input) || strings[1].equals(input) || strings[2].equals(input)) {
                System.out.println(strings[0] + " " + strings[1] + " " + strings[2]);
            }
        }
    }
}
