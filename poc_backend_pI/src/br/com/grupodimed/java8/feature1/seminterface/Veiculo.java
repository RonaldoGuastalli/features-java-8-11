package br.com.grupodimed.java8.feature1.seminterface;

import br.com.grupodimed.java8.feature1.Motor;

public abstract class Veiculo {
    Motor motor = new Motor();

    public String acelerar() {
        return "Aceleração constante";
    }

    public String desacelerar() {
        return "Desaceleração constante";

    }

}
