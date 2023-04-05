package Models;

public abstract class Pizza {

    public final PizzaLocalVariation _type;

    public PizzaLocalVariation getPizza(){
        return this._type;
    }

    public Pizza(PizzaLocalVariation t){
        this._type = t;
    }

    @Override
    public String toString(){
        return this._type + "";
    }

}
