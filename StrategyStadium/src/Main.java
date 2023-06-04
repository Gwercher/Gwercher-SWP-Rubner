import Models.*;

public class Main {

    public static void main(String[] args) {

        ChildTicket ct = new ChildTicket();
        ct.calculatePrice();

        AdultTicket at = new AdultTicket();
        at.calculatePrice();

        SeniorTicket st = new SeniorTicket();
        st.calculatePrice();

        StudentTicket stut = new StudentTicket();
        stut.calculatePrice();

    }


}
