package com.javarush.task.jdk13.task06.task0625;

import java.util.Scanner;

/* 
Минимальная сумма
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишите тут ваш код
        int min = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);

        int sum_row;
        for (int i = 0; i < array.length ; i++) {
            sum_row = 0;

            for (int j = 0; j < array[i].length; j++) {
                int num = scanner.nextInt();
                array[i][j] = num;
                sum_row+=num;
            }
            if (sum_row<min) min = sum_row;
        }
        // получили min в строках
        // получим с столбцах
        int sum_col;
        for (int i = 0; i < array.length ; i++) {
            sum_col = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum_col+=array[j][i];
            }
            if (sum_col<min) min = sum_col;
        }

        System.out.println(min);
    }
}
