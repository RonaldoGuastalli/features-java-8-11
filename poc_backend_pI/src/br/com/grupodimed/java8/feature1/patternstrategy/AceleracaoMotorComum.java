package br.com.grupodimed.java8.feature1.patternstrategy;

public class AceleracaoMotorComum implements IAceleracao {
    @Override
    public String acelerar() {
        return "Aceleração constante";
    }

    @Override
    public String desacelerar() {
        return "Desaceleração Constante";
    }
}
