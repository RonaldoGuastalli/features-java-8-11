package br.com.grupodimed.java8.defaultinterface.patternstrategy;

import br.com.grupodimed.java8.defaultinterface.Motor;

public abstract class AbstractVeiculo implements IAceleracao {
    Motor motor = new Motor();
    IAceleracao acelerador = new AceleracaoMotorComum();

    public String acelerar() {
        return acelerador.acelerar();
    }

    public String desacelerar() {
        return acelerador.desacelerar();
    }
}
