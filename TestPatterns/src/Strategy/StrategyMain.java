package Strategy;

import Strategy.Models.AStrategy;
import Strategy.Models.Adult;
import Strategy.Models.Child;

public class StrategyMain {
    public static void main(String[] args) {

        AStrategy child = new Child(10, "child");
        AStrategy adult = new Adult(25, "adult");

        child.getAgeAndGroup();
        adult.getAgeAndGroup();

    }
}
