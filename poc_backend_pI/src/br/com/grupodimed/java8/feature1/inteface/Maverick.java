package br.com.grupodimed.java8.feature1.inteface;

import br.com.grupodimed.java8.Motor;

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
