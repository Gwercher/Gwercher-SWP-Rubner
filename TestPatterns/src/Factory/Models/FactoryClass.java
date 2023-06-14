package Factory.Models;

public class FactoryClass {

    public static ACategory Factory(CEnum c, String nice) throws Exception{

        if(c == CEnum.Car) return new Car(nice);
        if(c == CEnum.Laptop) return new Laptop(nice);

        throw new Exception("no category exception");

    }

}
