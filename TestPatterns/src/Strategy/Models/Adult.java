package Strategy.Models;

public class Adult extends AStrategy{
    @Override
    public void getAgeAndGroup() {
        System.out.println("adult, age=" + this.getAge() + ", group=" + this.getGroup());
    }

    public Adult(int age, String group){
        super(age, group);
    }
}
