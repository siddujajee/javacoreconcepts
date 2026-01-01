package com.mulltithreading;

class CountToTen extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrintAlphabets extends Thread {
    @Override
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println(ch);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultithreadingUsingThreadClass {
    public static void main(String[] args) {
        CountToTen countToTen = new CountToTen();
        PrintAlphabets printAlphabets = new PrintAlphabets();
        countToTen.start();
        printAlphabets.start();
    }
}
