package br.com.grupodimed.java8.feature1.patternstrategy;

import br.com.grupodimed.java8.feature1.Motor;

public class Maverick extends Veiculo {
    public Maverick() {
        acelerador = new AceleracaoMotorV8();
        motor = new Motor("V8");

    }

}
