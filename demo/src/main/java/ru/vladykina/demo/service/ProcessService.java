package ru.vladykina.demo.service;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;
import ru.vladykina.demo.repository.ProductRepository;
import ru.vladykina.demo.task.LoggerTask;

@Service
public class ProcessService {
    private final ProductService productService;
    private final ProductRepository productRepository;
    private final ConfigurableApplicationContext context;

    int demonCount = 0;

    public ProcessService(ProductService productService, ProductRepository productRepository, ConfigurableApplicationContext context) {
        this.productService = productService;
        this.productRepository = productRepository;
        this.context = context;
    }

    public String process(){

        LoggerTask loggerTask = new LoggerTask(ProductRepository);
        Thread loggerThread = new Thread(loggerTask, "LoggerTask-Demon" + demonCount++);
        loggerThread.setDaemon(true);
        loggerThread.start();

        //Thread thread1 = new Thread(->new )


        return "Ok";
    }
}
