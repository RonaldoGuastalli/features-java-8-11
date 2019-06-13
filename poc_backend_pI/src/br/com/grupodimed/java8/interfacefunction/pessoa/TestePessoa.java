package br.com.grupodimed.java8.interfacefunction.pessoa;

import java.util.List;

public class TestePessoa {

    public static void main(String[] args) {
       var pessoas = List.of(
                new Pessoa("Paulo", Sexo.MASCULINO, 1990, "paulo@gmail.com"),
                new Pessoa("Maria", Sexo.FEMININO, 2000, "m@gmail.com"),
                new Pessoa("Jose", Sexo.MASCULINO, 1980, "jose@gmail.com"),
                new Pessoa("Pedro", Sexo.MASCULINO, 2010, "pedrinho@gmail.com")
        );

        System.out.println("=========================================================================================");
        System.out.println("Resultado do filtro utilizando Predicate e Consumer: ");
        Pessoa.processPessoa(
                pessoas,
                pessoa -> Sexo.MASCULINO == pessoa.getSexo()
                        && 18 <= pessoa.getIdade()
                        && 40 >= pessoa.getIdade(),
                pessoa -> System.out.println(pessoa.toString())
        );
        System.out.println("=========================================================================================");

    }
}
