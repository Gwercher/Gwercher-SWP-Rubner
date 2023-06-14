package Factory;

import Factory.Models.ACategory;
import Factory.Models.CEnum;
import Factory.Models.FactoryClass;

public class FactoryMain {
    public static void main(String[] args) {


        try {
            ACategory c = FactoryClass.Factory(CEnum.Car, "caaaaaaaaaaar");
            c.Cat();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
