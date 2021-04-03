package school.cesar.printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        for (int i = 0;i<4;i++) {
            new Thread(new RunPrint(printer)).start();
        }
    }
}