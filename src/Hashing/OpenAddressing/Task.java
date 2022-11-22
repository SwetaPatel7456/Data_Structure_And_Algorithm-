package Hashing.OpenAddressing;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {

    public String name;

    public Task(String name) {
        this.name = name;

    }

    @Override
    public String call() throws Exception {
        Task2 task2 = new Task2();
        return  task2.method();

    }
}
