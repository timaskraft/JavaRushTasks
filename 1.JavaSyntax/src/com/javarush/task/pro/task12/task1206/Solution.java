package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишите тут ваш код
        int count = 0;
        for (int i = 0; i < string.length(); i++) count += Character.isDigit(string.charAt(i))?1:0;
        return count;
    }

    public static int countLetters(String string) {
        //напишите тут ваш код
        int count = 0;
        for (int i = 0; i < string.length(); i++) count += Character.isLetter(string.charAt(i))?1:0;
        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) count += Character.isSpaceChar(string.charAt(i))?1:0;
        return count;
    }
}
