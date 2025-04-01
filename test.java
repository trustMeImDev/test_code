package com.codeflo;

public class Sample {
    public void start() {
        process();
        end();
    }

    private void process() {
        compute();
    }

    private void compute() {
        System.out.println("Computing...");
    }

    private void end() {
        System.out.println("Ending...");
    }
}
