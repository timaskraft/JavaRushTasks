package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        while (true)
        {
            String str = scanner.nextLine();
            if (str.equals("ENTER")) break;

            sum += Long.valueOf(str);


        }
        System.out.println(sum);

    }
}