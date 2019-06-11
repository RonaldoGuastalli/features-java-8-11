package br.com.grupodimed.java9.submissionpublisher.notafiscal;

public class NotaFiscal {

    private String cliente;
    private String livro;
    private double preco;


    public NotaFiscal(String cliente, String livro, double preco) {
        this.cliente = cliente;
        this.livro = livro;
        this.preco = preco;
    }

    public boolean temEmpreco() {
        return preco > 0;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
