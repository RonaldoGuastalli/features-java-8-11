package br.com.grupodimed.java8.defaultinterface.seminterface;

import br.com.grupodimed.java8.defaultinterface.Motor;

public class Maverick extends AbstractVeiculo {
    public Maverick() {
        motor = new Motor("V8");
    }

    @Override
    public String acelerar() {
        return "Aceleração Super Rápida";
    }

    @Override
    public String desacelerar() {
        return "Desaceleração Lenta";
    }
}
