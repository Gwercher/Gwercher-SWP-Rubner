package Proxy.Models;

public class Printer implements IProxy{
    @Override
    public void print(int pages) {
        System.out.println("printing " + pages + " pages");
    }
}
