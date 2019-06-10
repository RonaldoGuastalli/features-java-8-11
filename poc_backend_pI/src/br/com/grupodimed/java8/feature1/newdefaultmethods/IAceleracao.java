package br.com.grupodimed.java8.feature1.newdefaultmethods;

public interface IAceleracao {
    default String acelerar() {
        return "Aceleração constante";
    }

    default String desacelerar() {
        return "Desaceleração Constante";
    }

}
