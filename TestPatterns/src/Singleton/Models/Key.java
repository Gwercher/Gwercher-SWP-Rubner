package Singleton.Models;

public class Key {

    private static Key _key = null;

    private Key(){};

    public static Key getInstance(){

        if(_key == null){
            _key = new Key();
        }

        return _key;


    }

}
