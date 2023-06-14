package Observer.Models;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{

    List<IObject> objects = new ArrayList<>();

    @Override
    public void notifyObjects() {
        for(IObject o : objects){
            o.notification();
        }
    }

    @Override
    public void addOjects(IObject obj) {
        this.objects.add(obj);
    }

    @Override
    public void removeOjects(IObject obj) {
        this.objects.remove(obj);
    }
}
