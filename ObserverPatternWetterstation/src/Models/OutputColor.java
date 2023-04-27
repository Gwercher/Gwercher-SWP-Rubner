package Models;

public class OutputColor implements IOutput {

    @Override
    public void push(Sensor data) {

        if(data.getTemperature() <= 10){
            System.out.print("BLUE\t\t");
        }
        else if(data.getTemperature() >= 35){
            System.out.print("RED\t\t\t");
        }
        else{
            System.out.print("GREEN\t\t");
        }

    }

    private Sensor _data;

    public Sensor getSensor(){
        return this._data;
    }

    @Override
    public void pull(Sensor data) {
        this._data = data;
        System.out.println("updated Color");
    }


}
