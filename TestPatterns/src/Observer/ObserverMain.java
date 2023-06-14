package Observer;

import Observer.Models.*;

public class ObserverMain {
    public static void main(String[] args) {

        IObject object1 = new ObjectOne();
        IObject object2 = new ObjectTwo();

        ISubject subject = new Subject();

        subject.addOjects(object1);
        subject.addOjects(object2);

        subject.notifyObjects();

    }
}
