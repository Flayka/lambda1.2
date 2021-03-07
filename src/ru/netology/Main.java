package ru.netology;

public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = () -> 33;

        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}
