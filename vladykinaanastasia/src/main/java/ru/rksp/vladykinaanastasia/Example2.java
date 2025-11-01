package ru.rksp.vladykinaanastasia;

public class Example2 {
    public static void main(String[] args){
        System.out.println("Главный поток работает");
        Runnable task = new MyTask();
        Thread thread = new Thread(task);

        thread.start();
    }
}
