package com.javarush.task.jdk13.task06.task0632;

import java.util.Scanner;

/* 
Пирамида
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int high = scanner.nextInt();

        array = new char[high][high*2-1];

        for (int i = 0; i < array.length ; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (j < array.length - i - 1 || j > array[i].length - array.length + i) {
                    array[i][j] = ' ';
                } else {
                    array[i][j] = '#';
                }
                System.out.print( array[i][j]);
            }
            System.out.println();
        }



    }
}
