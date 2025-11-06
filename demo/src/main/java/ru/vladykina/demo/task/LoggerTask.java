package ru.vladykina.demo.task;

import ru.vladykina.demo.repository.ProductRepository;

import java.util.Locale;

public class LoggerTask implements Runnable{

    private ProductRepository productRepository;
    private boolean running = true;

    public LoggerTask(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run() {
        while (running){
            try {
                long count = ProductRepository.count();
                System.out.printf(LocaleDate.now() + ": INFO [Демон поток nameThread " + Thread.currentThread().getName()+ "] Количество продуктов %d%n", count );
                Thread.sleep(30000);
            }catch (InterruptedException e){
                System.out.println("Демон логгер остановлен" + Thread.currentThread().getName());
                Thread.currentThread().interrupt();
                break;
            }catch(Exception e){
                System.err.println("Демон, ошибка" + e.getMessage());
                break;
            }

        }
    }
}
