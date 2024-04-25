package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i <= 10; i++) {
            String str = "";
            for (int j = 1; j <= i; j++) {
                str = str+"8";
            }
            System.out.println(str);

        }

    }
}