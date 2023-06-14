package Singleton;

import Singleton.Models.Key;

public class SingletonMain {
    public static void main(String[] args) {

        Key k1 = Key.getInstance();
        Key k2 = Key.getInstance();

        System.out.println(k1);
        System.out.println(k2);


    }
}
