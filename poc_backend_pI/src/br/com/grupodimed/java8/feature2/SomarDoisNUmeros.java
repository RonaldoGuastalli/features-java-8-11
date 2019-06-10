package br.com.grupodimed.java8.feature2;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class SomarDoisNUmeros {
    public static void main(String[] args) {
        Integer n1 = 10;
        Integer n2 = 25;

        BiPredicate<Integer, Integer> testaNumeros = (numero1, numero2) -> numero1 > 0 && numero2 > 0;
        BiFunction<Integer, Integer, Integer> soma = (numero1, numero2) -> numero1 + numero2;

        if( testaNumeros.test(n1, n2)){
            System.out.println(soma.apply(n1, n2));
        }
    }
}
