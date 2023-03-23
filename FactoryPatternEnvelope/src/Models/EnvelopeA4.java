package Models;

public class EnvelopeA4 extends Envelope{

    private final static double _HEIGHT = 297;
    private final static double _WIDTH = 210;

    @Override
    public double getHeight() {
        return _HEIGHT;
    }

    @Override
    public double getWidth() {
        return _WIDTH;
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    public EnvelopeA4(){
        this(0.0);
    }

    public EnvelopeA4(double weight){
        super(weight);
    }

    @Override
    public String toString(){
        return "A4: " + super.toString() + ", " + _HEIGHT + " x " + _WIDTH + " [mm]";
    }



}
