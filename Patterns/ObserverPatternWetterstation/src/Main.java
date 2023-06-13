import Models.*;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Sensor sensor = new Sensor();

        ObserverDisplay display = new ObserverDisplay(sensor);
        ObserverColor color = new ObserverColor(sensor);
        ObserverSound sound = new ObserverSound(sensor);

        int c = 1;

        for(;;){
            // push variant
            sensor.measurePush();

            // pull variant
            /*sensor.measurePull();
            if(c % 3 == 0){
                sensor.pullAllObservers();
                c = 1;
            }
            c++;*/

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
