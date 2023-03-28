package Models;

public class EnvelopeA6 extends Envelope{

    private final static double _HEIGHT = 105;
    private final static double _WIDTH = 210;

    @Override
    public double getHeight() {
        return _HEIGHT;
    }

    @Override
    public double getWidth() {
        return _WIDTH;
    }

    public EnvelopeA6(){
        this(0.0);
    }

    public EnvelopeA6(double weight){
        super(weight);
    }

    @Override
    public String toString(){
        return "A6: " + super.toString() + ", " + _HEIGHT + " x " + _WIDTH + " [mm]";
    }

}