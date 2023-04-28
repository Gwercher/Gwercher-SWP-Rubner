package Models;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class ObserverSound implements IObserver {

    private final Sensor _subject;

    public ObserverSound(Sensor sensor){
        this._subject = sensor;
        this._subject.addObserver(this);
    }

    @Override
    public void pull() {
        if(_subject.getHumidity() >= 75){
            System.out.print("BEEP\n");
            sound();
        }
        else{
            System.out.print("....\n");
        }
    }

    @Override
    public void push(Sensor sensor) {
        if(sensor.getHumidity() >= 75){
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

}
