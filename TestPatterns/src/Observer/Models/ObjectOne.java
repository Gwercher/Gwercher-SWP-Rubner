package Observer.Models;

public class ObjectOne implements IObject{
    @Override
    public void notification() {
        System.out.println("object one notification");
    }
}
