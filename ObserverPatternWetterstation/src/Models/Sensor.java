package Models;

public class Sensor {

    private double _temp;
    private double _humidity;

    public double getTemperature(){
        return this._temp;
    }
    public void setTemperature(double temp){
        this._temp = temp;
    }

    public double getHumidity(){
        return this._humidity;
    }
    public void setHumidity(double humidity){
        this._humidity = humidity;
    }

    public Sensor(){
        this(0.0, 0.0);
    }

    public Sensor(double temp, double hum){
        this._temp = temp;
        this._humidity = hum;
    }

    @Override
    public String toString(){
        return "temp=" + this._temp + ", humidity=" + this._humidity;
    }

    public Sensor measure(){
        this._temp = (double)(Math.random() * 50);
        this._humidity = (double)(Math.random() * 100);

        return new Sensor(this._temp, this._humidity);

    }


}
