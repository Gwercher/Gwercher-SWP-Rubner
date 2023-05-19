import Models.IPrinter;
import Models.PrinterOptions;
import Models.ProxyPrinter;

public class Main {

    public static void main(String[] args) {

        IPrinter printer = new ProxyPrinter();

        try{
            printer.print(1, PrinterOptions.blackAndWhite);
            //printer.print(35);
        }catch (Exception e){
            e.printStackTrace();
        }



    }


}
