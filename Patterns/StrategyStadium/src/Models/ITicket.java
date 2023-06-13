package Models;

public interface ITicket {

    /**
     set tax in decimal
     @param tax in decimal (20% = 0.20)
     */
    public void setTax(double tax);

    public void calculatePrice();

}
