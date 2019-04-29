package com.cice;

import com.cice.crono.CronometroCICE;
import com.cice.runnable.CiceRunnable;
import com.cice.threads.CiceThread;
import com.cice.threads.CiceThread2;

public class Main {

    public static void main(String[] args) throws InterruptedException {
/*
        // Esto se ejecutara en segundo plano
        CiceThread ciceThread = new CiceThread();
        ciceThread.start();
        CiceThread2 ciceThread2 = new CiceThread2();
        ciceThread2.start();

        // Esto se ejecutara en tercer plano
        CiceRunnable ciceRunnable = new CiceRunnable();
        Thread hilo = new Thread(ciceRunnable);
        hilo.start();

        Thread hiloRunnable = new Thread(() -> {
            try{
                long start = System.currentTimeMillis();
                int contador = 0;
                while(contador <= 10){
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + ": " + (++contador) + " segundos");
                }
                long finalTime = System.currentTimeMillis() - start;
                System.out.println("Tiempo de ejecucion: " + finalTime/1000 + " segundos");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        hiloRunnable.start();
*/
        // esto se ejecutara en primer plano
//        Thread.sleep(2000);
//        System.out.println("Hola");
//        Thread.sleep(1000);
//        System.out.println("Que tal,");
//        Thread.sleep(3000);
//        System.out.println("Vamos a ver cuanto tarda en acabar el hilo paralelo");

        Thread crono = new Thread(new CronometroCICE());
        crono.start();



    }
}
