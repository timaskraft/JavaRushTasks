package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        int maxnum =10;
        MULTIPLICATION_TABLE = new int[maxnum][maxnum];
        for (int i = 0; i <maxnum ; i++) {
            for (int j = 0; j < maxnum; j++) {
                MULTIPLICATION_TABLE[i][j] = (i+1) * (j+1);
                System.out.print(MULTIPLICATION_TABLE[i][j]+" ");
            }
            System.out.println();
        }
    }
}
