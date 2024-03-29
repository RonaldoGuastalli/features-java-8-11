package br.com.grupodimed.java9.submissionpublisher;

public class Empregado {

    private int id;
    private String nome;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empregado(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Empregado() {
    }

    @Override
    public String toString() {
        return "[id="+id+",nome="+ nome +"]";
    }
}
