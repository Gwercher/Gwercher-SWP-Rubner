package Models;

public abstract class Store {

    public StoreLocation _loc;

    public StoreLocation getStoreLocation(){
        return this._loc;
    }

    public void setStoreLocation(StoreLocation s){
        this._loc = s;
    }

    public Store(StoreLocation l){
        this._loc = l;
    }

    public abstract Pizza cook(PizzaVariation p);
    public abstract Pizza cook(PizzaVariation p, StoreLocation s);

    @Override
    public String toString(){
        return this._loc + "";
    }

}
