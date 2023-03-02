package Model;

public class Printer {

    private static Printer _printer = new Printer("");
    private String _name;

    private Printer(String name){
        this._name = name;
    }

    public Printer getPrinter(String name){
        if(_printer == null){
            _printer = new Printer(name);
        }
        return _printer;
    }

    @Override
    public String toString(){
        return "Hi I'm a printer. My name is " + this._name;
    }

}
