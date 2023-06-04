package Models;

public class StudentTicket implements ITicket {

    private double _tax = 0.15;
    private final double _PRICE = 15;


    @Override
    public void setTax(double tax) {
        this._tax = tax;
    }

    @Override
    public void calculatePrice() {
        System.out.printf("student price=%.2f", _PRICE * (1+_tax));
        System.out.println();
    }
}
