package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
     //   System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        //напишите тут ваш код
        if(month.ordinal()==11 )
        {
            return Month.JANUARY;
        }else
        {
            return month.values()[month.ordinal()+1];
        }
    }
}
