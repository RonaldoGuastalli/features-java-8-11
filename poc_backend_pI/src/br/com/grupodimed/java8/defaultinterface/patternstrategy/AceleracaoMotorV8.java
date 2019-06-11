package br.com.grupodimed.java8.defaultinterface.patternstrategy;

public class AceleracaoMotorV8 implements IAceleracao{
    @Override
    public String acelerar() {
        return "Aceleração Super Rápida";
    }

    @Override
    public String desacelerar() {
        return "Desaceleração Lenta";
    }
}
