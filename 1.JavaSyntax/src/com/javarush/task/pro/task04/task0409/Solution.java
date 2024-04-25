package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int min = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            String str = scanner.nextLine();

            if (str.matches("-?\\d+")) {
                int num = Integer.valueOf(str);
                min = (min > num ? num : min);
            }else break;
        }

        System.out.println(min);

    }
}