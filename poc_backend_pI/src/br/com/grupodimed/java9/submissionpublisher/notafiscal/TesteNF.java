package br.com.grupodimed.java9.submissionpublisher.notafiscal;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;

public class TesteNF {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        //thread 1: main
        SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>(executorService, 1);
        publisher.consume(notaFiscal -> WebServicePrefeitura.emitir(notaFiscal));

        //thread 2
        publisher.consume(dado -> {
            System.out.println(">>>> Outra thread é " + Thread.currentThread().getName());
        });

        // venda concluída
        String thread = Thread.currentThread().getName();
        System.out.println(">>>> thread principal: " + thread);
        System.out.println("Gerando a nota");
        NotaFiscal notaFiscal = new NotaFiscal("Pedro", "Livro Java 9", 39.89);
        publisher.submit(notaFiscal);

        // outras ações necessárias
        System.out.println("Parabéns pela sua compra");

        System.out.println("aperte o enter para sair");
        new Scanner(System.in).nextLine();




    }
}
