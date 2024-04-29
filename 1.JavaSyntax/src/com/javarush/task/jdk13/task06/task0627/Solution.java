package com.javarush.task.jdk13.task06.task0627;

import java.util.Scanner;

/* 
Вот это переворот!
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length ; i++)
            for (int j = 0; j < array[i].length; j++)
                array[j][i] = scanner.nextInt();

        for (int i = 0; i < array.length ; i++)
        {
            for (int j = 0; j < array[i].length; j++)
                  System.out.print(array[i][j]);
            System.out.println();

        }

    }
}
