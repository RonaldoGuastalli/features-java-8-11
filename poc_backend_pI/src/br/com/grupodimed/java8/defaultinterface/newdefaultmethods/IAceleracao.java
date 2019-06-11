package br.com.grupodimed.java8.defaultinterface.newdefaultmethods;

public interface IAceleracao {
    default String acelerar() {
        return "Aceleração constante";
    }

    default String desacelerar() {
        return "Desaceleração Constante";
    }

}
