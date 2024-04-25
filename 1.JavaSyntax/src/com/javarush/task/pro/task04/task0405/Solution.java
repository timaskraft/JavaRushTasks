package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int max_row = 10;
        int max_col = 20;
        int row = 0;
        while(row++<max_row)
        {
            int col = 0;

            while(col++<max_col)
                if(row == 1 | row == max_row)
                    System.out.print("Б");
                else
                    System.out.print( (col==1 | col==max_col)? "Б":" ");

            System.out.println("");


        }


    }
}