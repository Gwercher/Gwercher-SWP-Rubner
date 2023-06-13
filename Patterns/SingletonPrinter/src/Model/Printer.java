package Model;

public class Printer extends Object {

    private static Printer _printer = null;
    private String _name;

    private Printer(String name){
        this._name = name;
    }

    public static Printer getInstance(String name){
        if(_printer == null){
            System.out.println("initializing new instance: " + name);
            _printer = new Printer(name);
        }
        return _printer;
    }

    public void changeName(String newName){
        _name = newName;
    }

    public String print(){
        return "I'm a printer. My name is " + _name;
    }
/*
    @Override
    public String toString(){
        return _name;
    }*/

}
