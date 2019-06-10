package br.com.grupodimed.java8.feature2;

public class TesteCalculadoraBiFunction {
    public static void main(String[] args) {

        CalculadoraBiFunction calculadoraBiFunction = new CalculadoraBiFunction();

        //resultado do calculo utilizando a calculadora com BiFunction
        String resultado = calculadoraBiFunction.fazerCalculo((a, b) -> "resultado: " + (a * b), 4 , 5);
        String resultadoInvalido = calculadoraBiFunction.fazerCalculo((a, b) -> "resultado: " + (a * b), 4 , -5);

        System.out.println(resultado);
        System.out.println(resultadoInvalido);
    }
}
