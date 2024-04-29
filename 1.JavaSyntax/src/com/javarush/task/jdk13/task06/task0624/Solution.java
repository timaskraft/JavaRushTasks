package com.javarush.task.jdk13.task06.task0624;

import java.util.Scanner;

/* 
Максимальный элемент
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишите тут ваш код
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int num = scanner.nextInt();
                array[i][j] = num;
                max = (num>max?num:max);
            }
        }
        System.out.println(max);

        Integer i = 0;

    }
}
