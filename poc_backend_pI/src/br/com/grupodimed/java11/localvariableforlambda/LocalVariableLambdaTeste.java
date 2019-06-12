package br.com.grupodimed.java11.localvariableforlambda;

import br.com.grupodimed.java11.localvariableforlambda.ISoma;

public class LocalVariableLambdaTeste {

    public static void main(String[] args) {
        double n1 = 10.00;
        double n2 = 14.55;
        double n3 = 10.00;
        String string = "5";

        System.out.println("=====================================================================");
        System.out.println("calculos, utilizando @FunctionalInterface com uso de var no lambda");
        ISoma soma = (double x, double y, double z, String s) -> x + y + z + Double.parseDouble(s);
        System.out.println(soma.paramParaCalculo(n1, n2, n3, string));

        ISoma soma2 = (var x, var y, var z, var s) -> (x / y * z) * Double.parseDouble(s);
        System.out.println(soma2.paramParaCalculo(n1, n2, n3, string));

        ISoma soma3 = (n11, n21, n31, string1) -> n11 + Math.pow(n31, Double.parseDouble(string1));
        System.out.println(soma3.paramParaCalculo(n1, n2, n3, string));
        System.out.println("=====================================================================");
    }




}
