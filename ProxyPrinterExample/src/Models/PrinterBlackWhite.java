package Models;

public class PrinterBlackWhite implements IPrinter {

    public static int maxPage = 500;

    @Override
    public void print(PrinterOptions option) {
        System.out.println("Printing in Black and White...");
    }

}
