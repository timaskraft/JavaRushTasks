package com.javarush.task.pro.task15.task1538;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Использование Paths
*/

public class Solution {

    public static Path rpmLogPath;

    public static void main(String[] args) throws Exception {
        rpmLogPath = Paths.get(new URI("file:/usr/lib/rpm/rpm.log"));
    }
}
