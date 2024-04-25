package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = scanner.nextInt();
        if (num>0 & num<5) {
            int i = 0;
            do {
                System.out.println(str);
            } while (++i < num);
        }else  System.out.println(str);


    }
}