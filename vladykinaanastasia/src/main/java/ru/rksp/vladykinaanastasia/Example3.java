package ru.rksp.vladykinaanastasia;

public class Example3 {
    public static void main(String[] args){
        Thread thread1 = new Thread(() -> {
            System.out.println("Имя = " + Thread.currentThread().getName());
        }, "Worker-1");

        Thread thread2 = new Thread(() -> {
            System.out.println("Имя =  " + Thread.currentThread().getName());
        });
        thread2.setName("Worker-2");

        thread1.start();
        thread2.start();
    }
}
