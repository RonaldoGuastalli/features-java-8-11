package br.com.grupodimed.java8.feature2.pessoa;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Pessoa {
    public enum Sexo {
        MASCULINO, FEMININO
    }

    private String nome;
    private Sexo sexo;
    private int anoAniversario;
    private String email;

    public Pessoa(String nome, Sexo sexo, int anoAniversario, String email) {
        this.nome = nome;
        this.sexo = sexo;
        this.anoAniversario = anoAniversario;
        this.email = email;
    }

    public int getIdade() {
        return LocalDate.now().getYear() - anoAniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome:'" + nome + '\'' +
                ", sexo: " + sexo +
                ", anoAniversario: " + anoAniversario +
                ", idade: " + getIdade() +
                ", email:'" + email + '\'' +
                '}';
    }

    public static void processPessoa(List<Pessoa> pessoas, Predicate<Pessoa> teste, Consumer<Pessoa> bloco) {
        for (Pessoa pessoa : pessoas) {
            if (teste.test(pessoa)) {
                bloco.accept(pessoa);
            }
        }
    }
}
