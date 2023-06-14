package Strategy.Models;

public abstract class AStrategy {

    private int _age;
    private String _group;

    public int getAge(){
        return this._age;
    }

    public String getGroup(){
        return this._group;
    }

    public AStrategy(int age, String group){
        this._age = age;
        this._group = group;
    }

    public abstract void getAgeAndGroup();


}
