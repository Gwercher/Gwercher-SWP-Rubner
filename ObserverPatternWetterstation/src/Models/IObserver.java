package Models;

public interface IObserver {

    public void pull();
    public void push(Sensor sensor);

}
