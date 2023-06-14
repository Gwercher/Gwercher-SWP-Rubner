package Strategy.Models;

public class Child extends AStrategy{
    @Override
    public void getAgeAndGroup() {
        System.out.println("child, age=" + this.getAge() + ", group=" + this.getGroup());
    }

    public Child(int age, String group){
        super(age, group);
    }
}
