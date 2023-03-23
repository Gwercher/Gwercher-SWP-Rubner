package Models;

public class EnvelopeFactory {

    public static Envelope getEnvelope(EnvEnum env, double weight){

        if(env == EnvEnum.A4) return new EnvelopeA4(weight);
        if(env == EnvEnum.A5) return new EnvelopeA5(weight);
        return new EnvelopeA6(weight);

    }


}
