package Models;

public class ObserverColor implements IObserver {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";

    private final Sensor _subject;

    public ObserverColor(Sensor sensor){
        this._subject = sensor;
        this._subject.addObserver(this);
    }

    @Override
    public void updatePull() {
        //System.out.print("Color updated\t\t");
        System.out.println("update color");
    }

    @Override
    public void pull(){
        if(_subject.getTemperature() <= 10){
            System.out.print(ANSI_BLUE + "BLUE\t\t" + ANSI_RESET);
        }
        else if(_subject.getTemperature() >= 35){
            System.out.print(ANSI_RED + "RED\t\t\t" + ANSI_RESET);
        }
        else{
            System.out.print(ANSI_GREEN + "GREEN\t\t" + ANSI_RESET);
        }
    }

    @Override
    public void push(Sensor sensor) {
        if(sensor.getTemperature() <= 10){
            System.out.print(ANSI_BLUE + "BLUE\t\t" + ANSI_RESET);
        }
        else if(_subject.getTemperature() >= 35){
            System.out.print(ANSI_RED + "RED\t\t\t" + ANSI_RESET);
        }
        else{
            System.out.print(ANSI_GREEN + "GREEN\t\t" + ANSI_RESET);
        }
    }


}
