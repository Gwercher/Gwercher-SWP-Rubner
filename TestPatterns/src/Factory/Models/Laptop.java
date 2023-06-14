package Factory.Models;

public class Laptop extends ACategory{

    @Override
    public void Cat() {
        System.out.println("my category is: " + this.getCategory());
    }

    public Laptop(String cat) {
        super(cat);
    }


}
