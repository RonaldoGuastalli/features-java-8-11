package br.com.grupodimed.java9.feature2;

import java.util.ArrayList;
import java.util.List;

public class EmpHelper {

    public static List<Empregado> getempregados() {

        Empregado e1 = new Empregado(1, "Pankaj");
        Empregado e2 = new Empregado(2, "David");
        Empregado e3 = new Empregado(3, "Lisa");
        Empregado e4 = new Empregado(4, "Ram");
        Empregado e5 = new Empregado(5, "Anupam");

        List<Empregado> empregados = new ArrayList<>();
        empregados.add(e1);
        empregados.add(e2);
        empregados.add(e3);
        empregados.add(e4);
        empregados.add(e5);

        return empregados;
    }


}
