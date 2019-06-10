package br.com.grupodimed.java8.feature2;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class CalculadoraBiFunction {

    public String fazerCalculo(BiFunction<Integer, Integer, String> funcaoBiFunction, Integer n1, Integer n2){
        BiPredicate<Integer, Integer> validarNumeros = (a, b) -> a > 0 && b > 0;
        return validarNumeros.test(n1, n2) ? funcaoBiFunction.apply(n1, n2) : "número inválido: < 0";
    }
}

