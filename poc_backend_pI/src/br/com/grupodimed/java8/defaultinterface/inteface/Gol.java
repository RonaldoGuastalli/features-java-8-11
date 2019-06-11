package br.com.grupodimed.java8.defaultinterface.inteface;

public class Gol extends Veiculo {
    @Override
    public String acelerar() {
        return "Aceleração constante";
    }

    @Override
    public String desacelerar() {
        return "Desaceleração constante";

    }
}
