package com.javarush.task.jdk13.task15.task1508;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(0D,"a");
        labels.put(1D,"b");
        labels.put(2D,"c");
        labels.put(3D,"d");
        labels.put(4D,"e");

    }



    public static void main(String[] args) {
        System.out.println(labels);
    }
}
