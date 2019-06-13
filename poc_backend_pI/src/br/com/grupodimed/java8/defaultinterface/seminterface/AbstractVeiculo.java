package br.com.grupodimed.java8.defaultinterface.seminterface;

import br.com.grupodimed.java8.defaultinterface.Motor;

public abstract class AbstractVeiculo {
    Motor motor = new Motor();

    public String acelerar() {
        return "Aceleração constante";
    }

    public String desacelerar() {
        return "Desaceleração constante";

    }

}
