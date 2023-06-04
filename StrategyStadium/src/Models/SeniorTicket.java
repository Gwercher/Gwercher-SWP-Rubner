package Models;

public class SeniorTicket implements ITicket {

    private double _tax = 0.175;
    private final double _PRICE = 18.95;

    @Override
    public void setTax(double tax) {
        this._tax = tax;
    }

    @Override
    public void calculatePrice() {
        System.out.printf("senior price=%.2f", _PRICE * (1+_tax));
        System.out.println();
    }

}
