package Models;

public interface IObserver {

    public void updatePull();
    public void pull();
    public void push(Sensor sensor);

}
