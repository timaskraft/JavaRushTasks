package com.javarush.task.jdk13.task15.task1503;

/* 
Мужчина или женщина?
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Human human) {
        System.out.println(human.name);
    }

    public static class Human {

         public String name = "";
    }

    public static class Man  extends  Human{

    }

    public static class Woman extends  Human {

    }
}
