import Models.*;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Sensor sensor = new Sensor();

        ObserverDisplay display = new ObserverDisplay(sensor);
        ObserverColor color = new ObserverColor(sensor);
        ObserverSound sound = new ObserverSound(sensor);

        for(;;){
            sensor.measurePull();
            //sensor.measurePush();

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
