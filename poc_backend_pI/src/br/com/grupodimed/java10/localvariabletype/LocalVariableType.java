package br.com.grupodimed.java10.localvariabletype;

import java.util.List;

public class LocalVariableType {

    public static void main(String[] args){

        var numbers = List.of(1, 2, 3, 5, 7, 8, 9);
        System.out.println(numbers);

        for(var i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        for (var number : numbers) {
            System.out.println(number);
        }

        for (var i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        List<Pessoa> pessoas1 =  List.of(new Pessoa("Maria", 28));
        var pessoas2 = List.of(new Pessoa("Pedro", 25));

        System.out.println(pessoas1);
        System.out.println(pessoas2);

//        var animal = null;
//        System.out.println(animal);
    }

}
