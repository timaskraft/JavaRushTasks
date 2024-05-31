package com.javarush.task.jdk13.task28.task2817;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* 
Полусекундомер
*/

public class Solution {

    public static ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(3);

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        scheduledPool.scheduleAtFixedRate((Runnable) () -> System.out.println(LocalTime.now()), 0,500, TimeUnit.MILLISECONDS );


        Thread.sleep(3000);
        scheduledPool.shutdown();
    }
}
