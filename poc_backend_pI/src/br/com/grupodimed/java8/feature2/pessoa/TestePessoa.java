package br.com.grupodimed.java8.feature2.pessoa;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestePessoa {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Paulo", Pessoa.Sexo.MASCULINO, 1990, "paulo@gmail.com"),
                new Pessoa("Maria", Pessoa.Sexo.FEMININO, 2000, "m@gmail.com"),
                new Pessoa("Jose", Pessoa.Sexo.MASCULINO, 1980, "jose@gmail.com"),
                new Pessoa("Pedro", Pessoa.Sexo.MASCULINO, 2010, "pedrinho@gmail.com")
        );

        Pessoa.processPessoa(
                pessoas,
                pessoa -> pessoa.getSexo() == Pessoa.Sexo.MASCULINO
                        && pessoa.getIdade() >= 18
                        && pessoa.getIdade() <= 40,
                pessoa -> System.out.println(pessoa.toString())
        );
    }
}
