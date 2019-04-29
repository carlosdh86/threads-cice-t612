package com.cice;

import com.cice.runnable.CiceRunnable;
import com.cice.threads.CiceThread;
import com.cice.threads.CiceThread2;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Esto se ejecutara en segundo plano
        CiceThread ciceThread = new CiceThread();
        ciceThread.start();
        CiceThread2 ciceThread2 = new CiceThread2();
        ciceThread2.start();

        // Esto se ejecutara en tercer plano
        CiceRunnable ciceRunnable = new CiceRunnable();
        Thread hilo = new Thread(ciceRunnable);
        hilo.start();

        // esto se ejecutara en primer plano
//        Thread.sleep(2000);
//        System.out.println("Hola");
//        Thread.sleep(1000);
//        System.out.println("Que tal,");
//        Thread.sleep(3000);
//        System.out.println("Vamos a ver cuanto tarda en acabar el hilo paralelo");

    }
}
