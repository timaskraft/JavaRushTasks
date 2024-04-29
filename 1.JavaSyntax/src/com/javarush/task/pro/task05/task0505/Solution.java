package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num>0)
        {
            int[] array = new int[num];
            for (int i = 0; i < num; i++) {
                array[i] = scanner.nextInt();
            }
            if(num%2>0)
            {
                for (int i = 0; i < num; i++) {
                   System.out.println(array[i]);
                }
            }else
            {
                for (int i = 0; i < num; i++) {
                    System.out.println(array[num-i-1]);
                }
            }

        }



    }
}
