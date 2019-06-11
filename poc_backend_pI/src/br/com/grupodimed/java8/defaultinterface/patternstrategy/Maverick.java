package br.com.grupodimed.java8.defaultinterface.patternstrategy;

import br.com.grupodimed.java8.defaultinterface.Motor;

public class Maverick extends Veiculo {
    public Maverick() {
        acelerador = new AceleracaoMotorV8();
        motor = new Motor("V8");

    }

}
