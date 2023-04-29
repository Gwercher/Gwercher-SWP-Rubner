package Models;

public interface ISubject {

    public void addObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObserverPull();
    public void pullAllObservers();
    public void notifyObserverPush(Sensor sensor);


}
