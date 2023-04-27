package Models;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class OutputSound implements IOutput {

    @Override
    public void push(Sensor data) {

        if(data.getHumidity() >= 75){
            System.out.print("BEEEP\n");

            sound();

        }
        else{
            System.out.print("....\n");
        }

    }

    public void sound(){
        File file = new File(".\\beep.wav");
        AudioInputStream audioStream = null;
        try {
            audioStream = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
        Clip clip = null;
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        try {
            clip.open(audioStream);
        } catch (LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
        clip.start();
    }

    private Sensor _data;

    public Sensor getSensor(){
        return this._data;
    }

    @Override
    public void pull(Sensor data) {
        this._data = data;
        System.out.println("updated Sound");
    }


}
