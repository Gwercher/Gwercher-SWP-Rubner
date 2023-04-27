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

    @Override
    public String toString(){
        return "temp=" + this._temp + ", humidity=" + this._humidity;
    }




}
