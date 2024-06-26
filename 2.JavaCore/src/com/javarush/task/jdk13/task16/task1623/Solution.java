package com.javarush.task.jdk13.task16.task1623;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем секунды
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {

            try {
                while(!isInterrupted())
                {
                    seconds++;
                    Thread.sleep(1000);
                }

                //напишите тут ваш код
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
