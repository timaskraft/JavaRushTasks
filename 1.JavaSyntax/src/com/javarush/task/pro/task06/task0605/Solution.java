package com.javarush.task.pro.task06.task0605;

/* 
Правильный порядок
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //напишите тут ваш код
        for (int i = 0; i < array.length / 2; i++) {
            int c = array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]= c;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}