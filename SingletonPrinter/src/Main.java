import Model.Printer;

public class Main {

    public static void main(String[] args) {

        // cannot use private constructor
        // Printer p = new Printer("printer p");

        // instead use:
        Printer john = Printer.getInstance("john");
        System.out.println(john.print());

        // when trying to initialize a second instance, it returns the first instance
        Printer peter = Printer.getInstance("peter");
        System.out.println(peter.print());

        if(john == peter){
            System.out.println("instance 'john' and 'peter' are the same");
        }

        john.changeName("tony");
        System.out.println("\nchangeName() john to 'tony'");
        System.out.println("instance john: " + john.print());
        System.out.println("instance peter" + peter.print());

        john.changeName("test");
        System.out.println("\nchangeName() peter to 'test'");
        System.out.println("instance john: " + john.print());
        System.out.println("instance peter" + peter.print());




    }

}
