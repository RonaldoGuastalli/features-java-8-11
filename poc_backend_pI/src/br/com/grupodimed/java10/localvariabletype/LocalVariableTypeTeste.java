package br.com.grupodimed.java10.localvariabletype;

import java.util.List;

public class LocalVariableTypeTeste {

    public static void main(String[] args){
        System.out.println("=====================================================================");
        System.out.println("Criando uma lista imutável");
        var numbers = List.of(1, 2, 3, 5, 7, 8, 9);
        System.out.println("lista imutável -> " + numbers);

        System.out.println("=====================================================================");
        System.out.println("var no for");
        for(var i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        System.out.println("=====================================================================");
        System.out.println("var no forEach");
        for (var number : numbers) {
            System.out.println(number);
        }
        System.out.println("=====================================================================");
        System.out.println("var variável declarada");
        List<Pessoa> pessoas1 =  List.of(new Pessoa("Maria", 28));
        var pessoas2 = List.of(new Pessoa("Pedro", 25));
        System.out.println(pessoas1);
        System.out.println(pessoas2);

        //Erro:
//        var animal = null;
//        System.out.println(animal);
    }

}
