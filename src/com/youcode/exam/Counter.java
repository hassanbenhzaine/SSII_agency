package com.youcode.exam;

public class Counter implements Runnable{
    private static int count = 0;

    /*
     * Increments count in a thread-safe manner
     */
    public synchronized static int increment() {
        count += 1;
        return count;
    }

    @Override
    public void run() {
        System.out.println(
                Counter.increment()
        );
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Counter());
        t1.start();
        Thread t2 = new Thread(new Counter());
        t2.start();
    }
}