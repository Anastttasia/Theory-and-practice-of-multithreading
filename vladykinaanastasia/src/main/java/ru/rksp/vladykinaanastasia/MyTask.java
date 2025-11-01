package ru.rksp.vladykinaanastasia;

public class MyTask implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("Поток " + Thread.currentThread() + "Счетчик " +i);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e){
                System.out.println("Поток был прерван");
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println("Поток был завершен");
    }
}
