package Observer.Models;

public interface ISubject {

    public void notifyObjects();

    public void addOjects(IObject obj);

    public void removeOjects(IObject obj);



}
