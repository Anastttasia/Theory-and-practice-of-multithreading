package ru.rksp.vladykinaanastasia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VladykinaanastasiaApplication {
	public static void main(String[] args) {
        Thread thread = new Thread(() ->{
            System.out.println("ID = " + Thread.currentThread().getId());
            System.out.println("Name = " + Thread.currentThread().getName());
            System.out.println("Priority = " + Thread.currentThread().getPriority());
            System.out.println("Daemon = " + Thread.currentThread().isDaemon());
        });
        thread.start();

        Thread thread2 = new Thread(() ->{
            System.out.println("ID = " + Thread.currentThread().getId());
            System.out.println("Name = " + Thread.currentThread().getName());
            System.out.println("Priority = " + Thread.currentThread().getPriority());
            System.out.println("Daemon = " + Thread.currentThread().isDaemon());
        });
        thread2.start();
	}

}
