package br.com.grupodimed.java8.feature1.patternstrategy;

import br.com.grupodimed.java8.feature1.Motor;

public abstract class Veiculo implements IAceleracao {
    Motor motor = new Motor();
    IAceleracao acelerador = new AceleracaoMotorComum();

    public String acelerar() {
        return acelerador.acelerar();
    }

    public String desacelerar() {
        return acelerador.desacelerar();
    }
}
