package br.com.grupodimed.java8.defaultinterface.inteface;

import br.com.grupodimed.java8.defaultinterface.Motor;

public class Maverick extends Veiculo {
    public Maverick(){
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
