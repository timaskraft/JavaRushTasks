package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        multiArray = new int[row][];
        for (int i = 0; i < row; i++) {
            int col = scanner.nextInt();
            multiArray[i] = new int[col];
        }
        System.out.println("done..");
    }
}

