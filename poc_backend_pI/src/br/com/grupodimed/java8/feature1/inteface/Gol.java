package br.com.grupodimed.java8.feature1.inteface;

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
