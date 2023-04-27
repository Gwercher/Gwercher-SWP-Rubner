package Models;

public class OutputColor implements IOutput {

    @Override
    public void push(Sensor data) {

        if(data.getTemperature() <= 0){
            System.out.println("BLUE");
        }
        if(data.getTemperature() >= 35){
            System.out.println("RED");
        }

    }

}
