package com.marat;

public class Test {

    private long counter;

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();

        test.doWork();
        }


    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            long start = System.currentTimeMillis();
            for (long i = 0; i<30000000000L; i++)
                counter++;
            long end = System.currentTimeMillis();
            System.out.println("Время выполнения первого потока " + (double)(end-start)/1000+ " секунд");
        });

        Thread thread2 = new Thread(() -> {
            long start = System.currentTimeMillis();
            for (long i = 0; i<30000000000L; i++)
                counter++;
            long end = System.currentTimeMillis();
            System.out.println("Время выполнения второго потока " + (double)(end-start)/1000+ " секунд");
        });
        Thread thread3 = new Thread(() -> {
            long start = System.currentTimeMillis();
            for (long i = 0; i<30000000000L; i++)
                counter++;
            long end = System.currentTimeMillis();
            System.out.println("Время выполнения третьего потока " + (double)(end-start)/1000+ " секунд");
        });
        Thread thread4 = new Thread(() -> {
            long start = System.currentTimeMillis();
            for (long i = 0; i<30000000000L; i++)
                counter++;
            long end = System.currentTimeMillis();
            System.out.println("Время выполнения четвертого потока " + (double)(end-start)/1000+ " секунд");
        });
        Thread thread5 = new Thread(() -> {
            long start = System.currentTimeMillis();
            for (long i = 0; i<30000000000L; i++)
                counter++;
            long end = System.currentTimeMillis();
            System.out.println("Время выполнения пятого потока " + (double)(end-start)/1000+ " секунд");
        });
        Thread thread6 = new Thread(() -> {
            long start = System.currentTimeMillis();
            for (long i = 0; i<30000000000L; i++)
                counter++;
            long end = System.currentTimeMillis();
            System.out.println("Время выполнения шестого потока " + (double)(end-start)/1000+ " секунд");
        });
        Thread thread7 = new Thread(() -> {
            long start = System.currentTimeMillis();
            for (long i = 0; i<30000000000L; i++)
                counter++;
            long end = System.currentTimeMillis();
            System.out.println("Время выполнения седьмого потока " + (double)(end-start)/1000+ " секунд");
        });
        Thread thread8 = new Thread(() -> {
            long start = System.currentTimeMillis();
            for (long i = 0; i<30000000000L; i++)
                counter++;
            long end = System.currentTimeMillis();
            System.out.println("Время выполнения восьмого потока " + (double)(end-start)/1000+ " секунд");
        });
        Thread thread9 = new Thread(() -> {
            long start = System.currentTimeMillis();
            for (long i = 0; i<30000000000L; i++)
                counter++;
            long end = System.currentTimeMillis();
            System.out.println("Время выполнения девятого потока " + (double)(end-start)/1000+ " секунд");
        });
        Thread thread10 = new Thread(() -> {
            long start = System.currentTimeMillis();
            for (long i = 0; i<30000000000L; i++)
                counter++;
            long end = System.currentTimeMillis();
            System.out.println("Время выполнения десятого потока " + (double)(end-start)/1000+ " секунд");
        });



        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        thread6.join();
        thread7.join();
        thread8.join();
        thread9.join();
        thread10.join();


        System.out.println();
        System.out.println(counter);
    }
}
