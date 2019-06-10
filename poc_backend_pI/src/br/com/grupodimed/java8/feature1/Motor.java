package br.com.grupodimed.java8.feature1;

public class Motor {
    private String tipo; //1.0, 2.0, turbo

    public Motor() {
    }

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
