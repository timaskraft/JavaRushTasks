package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишите тут ваш код

        int l = array.length % 2;

        if( l == 0)
        {
            Arrays.fill(array,0, (array.length) / 2 ,valueStart );
            Arrays.fill(array, (array.length) / 2 ,(array.length),valueEnd );
        }else
        {
            Arrays.fill(array,0, (array.length+1) / 2 ,valueStart );
            Arrays.fill(array, (array.length+1) / 2 ,(array.length),valueEnd );

        }

        System.out.println(Arrays.toString(array));
    }
}
