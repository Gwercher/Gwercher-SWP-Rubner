package Models;

import java.util.ArrayList;
import java.util.List;

public class Sensor implements ISubject {

    private double _temp;
    private double _humidity;

    public double getTemperature(){
        return this._temp;
    }

    public double getHumidity(){
        return this._humidity;
    }

    public Sensor(){}
    public Sensor(double t, double h){
        this._temp = t;
        this._humidity = h;
    }

    public void measurePull(){
        this._temp = (double)(Math.random() * 50);
        this._humidity = (double)(Math.random() * 100);
        this.notifyObserverPull();
    }

    public void measurePush(){
        this._temp = (double)(Math.random() * 50);
        this._humidity = (double)(Math.random() * 100);
        this.notifyObserverPush(new Sensor(this._temp, this._humidity));
    }

    List<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserverPull() {
        for(IObserver ob : this.observers){
            ob.pull();
        }
    }

    @Override
    public void notifyObserverPush(Sensor sensor) {
        for(IObserver ob : this.observers){
            ob.push(sensor);
        }
    }
}
