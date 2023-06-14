package Observer.Models;

public class ObjectTwo implements IObject{
    @Override
    public void notification() {
        System.out.println("object two notification");
    }
}
