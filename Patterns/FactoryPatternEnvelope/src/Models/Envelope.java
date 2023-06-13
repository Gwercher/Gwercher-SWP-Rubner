package Models;

public abstract class Envelope {

    private double _weight;

    public double getWeight(){
        return this._weight;
    }

    public void setWeight(double weight){
        this._weight = weight;
    }

    public abstract double getHeight();

    public abstract double getWidth();

    public Envelope(){
        this(0.0);
    }

    public Envelope(double weight){
        this._weight = weight;
    }

    @Override
    public String toString(){
        return this._weight + " [g]";
    }


}
