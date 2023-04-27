package Models;

public class OutputDisplay implements IOutput {

    @Override
    public void push(Sensor data) {

        System.out.println(data.toString());

    }

}
