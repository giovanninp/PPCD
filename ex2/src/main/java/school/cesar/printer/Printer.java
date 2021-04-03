package school.cesar.printer;

import main.java.school.cesar.printer.Pool;

public class Printer {
    public static Pool pool;

    public Printer() {
        pool = new Pool();
    }

    public void print() {
        while(!pool.attemptToPrint()){};
        System.out.print("-");
        try {
            Thread.sleep(50);
        } catch (InterruptedException exn) {
        }
        System.out.print("|");
        pool.releasePrinter();
    }
}
