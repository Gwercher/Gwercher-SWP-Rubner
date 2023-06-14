package Factory.Models;

public class Car extends ACategory{

    @Override
    public void Cat() {
        System.out.println("my category is: " + this.getCategory());
    }

    public Car(String cat) {
        super(cat);
    }


}
