package Models;

public class AdultTicket implements ITicket {

    private double _tax = 0.20;
    private final double _PRICE = 20.99;

    @Override
    public void setTax(double tax) {
        this._tax = tax;
    }

    @Override
    public void calculatePrice() {
        System.out.printf("adult price=%.2f", _PRICE * (1+_tax));
        System.out.println();
    }
}
