package Models;

public class ObserverDisplay implements IObserver {

    private final Sensor _subject;

    public ObserverDisplay(Sensor sensor){
        this._subject = sensor;
        this._subject.addObserver(this);
    }

    @Override
    public void pull() {
        System.out.printf("temp=%.2f, humidity=%.2f\t\t", this._subject.getTemperature(), this._subject.getHumidity());
    }

    @Override
    public void push(Sensor sensor) {
        System.out.printf("temp=%.2f, humidity=%.2f\t\t", sensor.getTemperature(), sensor.getHumidity());
    }

}
