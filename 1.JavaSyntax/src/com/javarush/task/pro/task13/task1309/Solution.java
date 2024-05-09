package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;
import java.util.Map;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Ivanov Ivan",5.0);
        grades.put("Sidorov Ivan",4.3);
        grades.put("Petrov Petya",3.4);
        grades.put("Azarova Anna",4.8);
        grades.put("Roberst Julia",4.2);
    }
}
