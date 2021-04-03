package main.java.school.cesar.printer;

import java.util.concurrent.Semaphore;

public class Pool {
    private Semaphore semaphore;

    public Pool() {
        this.semaphore = new Semaphore(1);
    }

    public boolean attemptToPrint() {
        return this.semaphore.tryAcquire(1);
    }

    public void releasePrinter() {
        this.semaphore.release();
    }
}