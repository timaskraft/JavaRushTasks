package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        array = new int[num];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
             if (array[i]>max) max = array[i];
        }

        System.out.println(max);
    }

}
