package br.com.grupodimed.java8.defaultinterface.seminterface;

public class TesteSemUsoInterface {
    public static void main(String[] args) {
        Gol gol = new Gol();
        Fiesta fiesta = new Fiesta();
        Maverick moMaverick = new Maverick();
        StringBuffer stringBuffer = new StringBuffer();

        System.out.println(stringBuffer
                .append(">>>> SEM USO da Interface >>>>\n")
                .append("Gol: ").append(gol.acelerar()).append(" - ").append(gol.desacelerar())
                .append("\n")
                .append("Fiesta: ").append(fiesta.acelerar()).append(" - ").append(fiesta.desacelerar())
                .append("\n")
                .append("Maverick: ").append(moMaverick.acelerar()).append(" - ").append(moMaverick.desacelerar())
        );

    }
}
