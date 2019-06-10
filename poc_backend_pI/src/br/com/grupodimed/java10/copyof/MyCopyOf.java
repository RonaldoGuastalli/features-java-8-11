package br.com.grupodimed.java10.copyof;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCopyOf {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println("cria a lista >>> " + list);

        List<Integer> imutavel = Collections.unmodifiableList(list);
        System.out.println("transforma lista para imutável >>> " + imutavel);

        try{
            imutavel.add(8);
        }catch (UnsupportedOperationException e){
            System.out.println("!!!!Um erro foi gerado ao tentar add um valor na lista IMUTÁVEL.!!!!");
        }

        List<Integer> listComCopyOf = List.copyOf(list);
        System.out.println("Uso do List.copyOf(collection) >>> " + listComCopyOf);

        try{
            listComCopyOf.add(8);
        }catch (UnsupportedOperationException e){
            System.out.println("!!!!Um erro foi gerado ao tentar add um valor na lista COPYOF.!!!!");
        }

        list.add(10);
        System.out.println("novo valor da lista ápos add ... " + list);
        System.out.println("novo valor da lista IMUTÁVEL ... " + imutavel);
        System.out.println("novo valor da lista COPYOF ... " + listComCopyOf);







    }
}
