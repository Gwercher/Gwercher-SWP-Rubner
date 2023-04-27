package Models;

public class OutputDisplay implements IOutput {

    @Override
    public void push(Sensor data) {

        System.out.printf("temp=%.2f, humidity=%.2f\t\t", data.getTemperature(), data.getHumidity());


    }

    private Sensor _data;

    public Sensor getSensor(){
        return this._data;
    }

    @Override
    public void pull(Sensor data) {
        this._data = data;
        System.out.println("updated Display");
    }



}
