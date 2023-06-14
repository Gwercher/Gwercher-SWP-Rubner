package Proxy.Models;

public class ProxyPrinter implements IProxy{
    @Override
    public void print(int pages){

        Printer p = new Printer();

        if(pages <= 50){
            p.print(pages);
        }
        else {
            System.out.println("too many pages!!");
        }



    }
}
