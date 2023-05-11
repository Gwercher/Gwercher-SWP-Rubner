package Models;

public class PrinterColor implements IPrinter {

    public static int maxPage = 500;

    @Override
    public void print(PrinterOptions option) {
        System.out.println("Printing in color...");
    }

}
