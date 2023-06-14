package Factory.Models;

public abstract class ACategory {

    private String _category;

    public String getCategory(){
        return this._category;
    }

    public abstract void Cat();

    public ACategory(String cat){
        this._category = cat;
    }




}
