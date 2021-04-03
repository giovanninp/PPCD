package school.cesar.printer;

public class RunPrint implements Runnable {
    private Printer printer;

    public RunPrint(Printer printer) {
        this.printer = printer;
    }
    public void run() {
        while (true) {
            this.printer.print();
        }
    }
    
}
