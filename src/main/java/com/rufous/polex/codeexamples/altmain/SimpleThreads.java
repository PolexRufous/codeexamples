package com.rufous.polex.codeexamples.altmain;

public class SimpleThreads {
    public static void main(String[] args) {
        System.out.println("Hello from: " + Thread.currentThread().getName());

        Thread a = new Thread(() -> {
            int counter = 0;
            while (counter < 10) {
                System.out.println("Hello from: " + Thread.currentThread().getName());
                sleep1SCarefully();
                counter++;
            }
        });
        Thread b = new Thread(() -> {
            int counter = 0;
            while (counter < 10) {
                System.out.println("Hello from: " + Thread.currentThread().getName());
                sleep1SCarefully();
                counter++;
            }
        });

        // a.setDaemon(true);
        // b.setDaemon(true);

        a.start();
        b.start();

        System.out.println("Good bye from: " + Thread.currentThread().getName());
    }

    private static void sleep1SCarefully() {
        try {
            Thread.sleep(1_000L);
        } catch (InterruptedException e) {
            System.err.println("The thread was interrupted. " + Thread.currentThread().getName());
        }
    }
}
