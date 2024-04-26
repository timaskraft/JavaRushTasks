package com.javarush.task.jdk13.task12.task1211;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {

         print(1);
         print(Integer.valueOf(2));

    }

    static void print(int i){
        System.out.println("int:"+i);
    }
    static void print(Integer i){
        System.out.println("Integer:"+i);
    }
    //Напишите тут ваши методы
}
