import Models.*;

public class Main {

    public static void main(String[] args) {

        Envelope a4 = EnvelopeFactory.getEnvelope(EnvEnum.A4, 10.5);
        Envelope a5 = EnvelopeFactory.getEnvelope(EnvEnum.A5, 5.75);
        Envelope a6 = EnvelopeFactory.getEnvelope(EnvEnum.A6, 3.5);

        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

    }

}
