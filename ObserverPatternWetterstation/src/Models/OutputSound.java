package Models;

public class OutputSound implements IOutput {

    @Override
    public void push(Sensor data) {

        if(data.getHumidity() >= 75){
            System.out.println("BEEEEEEEEEEEP");
        }
        else{
            System.out.println("....");
        }

    }

}
