import Models.OutputColor;
import Models.OutputDisplay;
import Models.OutputSound;
import Models.Sensor;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Sensor sensor = new Sensor();
        OutputDisplay display = new OutputDisplay();
        OutputColor color = new OutputColor();
        OutputSound sound = new OutputSound();


        for(;;){
            sensor.measure();

            //System.out.printf("temp=%.2f, humidity=%.2f\n", sensor.getTemperature(), sensor.getHumidity());

            display.push(sensor);
            color.push(sensor);
            sound.push(sensor);

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }


}
