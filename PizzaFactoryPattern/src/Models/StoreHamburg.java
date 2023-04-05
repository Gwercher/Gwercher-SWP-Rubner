package Models;

public class StoreHamburg extends Store{

    public StoreHamburg(StoreLocation l) {
        super(l);
    }

    @Override
    public Pizza cook(PizzaVariation p) {
        if(p == PizzaVariation.Salami) return new PizzaSalami(PizzaLocalVariation.HamburgSalami);
        if(p == PizzaVariation.Calzone) return new PizzaCalzone(PizzaLocalVariation.HamburgCalzone);
        return new PizzaHawaii(PizzaLocalVariation.HamburgHawaii);
    }

    @Override
    public Pizza cook(PizzaVariation p, StoreLocation s) {
        if(p == PizzaVariation.Salami){
            if(s == StoreLocation.Berlin) return new PizzaSalami(PizzaLocalVariation.BerlinSalami);
            if(s == StoreLocation.Hamburg) return new PizzaSalami(PizzaLocalVariation.HamburgSalami);
            return new PizzaSalami(PizzaLocalVariation.RostockSalami);
        }
        if(p == PizzaVariation.Hawaii){
            if(s == StoreLocation.Berlin) return new PizzaHawaii(PizzaLocalVariation.BerlinHawaii);
            if(s == StoreLocation.Hamburg) return new PizzaHawaii(PizzaLocalVariation.HamburgHawaii);
            return new PizzaHawaii(PizzaLocalVariation.RostockHawaii);
        }
        //if(p == PizzaVariation.Calzone){
        if(s == StoreLocation.Berlin) return new PizzaCalzone(PizzaLocalVariation.BerlinCalzone);
        if(s == StoreLocation.Hamburg) return new PizzaCalzone(PizzaLocalVariation.HamburgCalzone);
        return new PizzaCalzone(PizzaLocalVariation.RostockCalzone);
        //}
    }
}
