package Models;

public class ChildTicket implements ITicket {

    private double _tax = 0.15;
    private final double _PRICE = 15.99;

    @Override
    public void setTax(double tax) {
        this._tax = tax;
    }

    @Override
    public void calculatePrice() {
        System.out.printf("child price=%.2f", _PRICE * (1+_tax));
        System.out.println();
    }
}
