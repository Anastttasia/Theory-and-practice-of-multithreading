package ru.vladykina.demo.utils;

public class TaskSimulateWork {
    public static void simulateCpuWork(String step, long millis){
        System.out.println(" [" + Thread.currentThread().getName() + "]" + step + "активная работа началась...");

        long start = System.currentTimeMillis();
        long count = 0;
        while (System.currentTimeMillis() - start<millis){
            count+= Math.sqrt(count+1) % 1000;
        }
        System.out.println(" [" + Thread.currentThread().getName() + "] завершено, иттераций " + count);

    }
}
