package br.com.grupodimed.java9.feature1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Immutable {
    public static void main(String[] args) {

        System.out.println("<<<< lista imutável >>>>");
        List<String> stringList = List.of("a", "b", "c");
        for (String s: stringList) {
            System.out.println(s);
        }

        System.out.println("<<<< lista imutável: ERRO >>>>");
        try {
            stringList.add("d");
            stringList.forEach(System.out::println);
        }catch (UnsupportedOperationException e){
            System.out.println("Erro: tenativa de add elemento na lista!");
        }

        System.out.println("<<<< lista mutável >>>>");
        List<String> stringList2 = new ArrayList<>();
        stringList2.addAll(Arrays.asList("d", "e", "f"));
        stringList2.forEach(System.out::println);
        stringList2.add("g");
        stringList2.forEach(System.out::println);


    }
}
