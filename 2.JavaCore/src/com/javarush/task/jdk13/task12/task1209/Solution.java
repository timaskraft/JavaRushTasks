package com.javarush.task.jdk13.task12.task1209;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        //System.out.println(o.getClass().getSimpleName());
        if (o instanceof Cow)    return "Корова";
        if (o instanceof Dog)    return "Собака";
        if (o instanceof Whale)    return "Кит";

        return "Неизвестное животное";
    }

    public static class Cow {

    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
