package com.javarush.task.pro.task03.task0311;

import java.text.DecimalFormat;
import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        Double n1 = scanner.nextDouble();
        Double n2 = scanner.nextDouble();


        if (Math.abs(n1-n2)<0.000001)
            System.out.println("числа равны");
        else
            System.out.println("числа не равны");
    }
}
