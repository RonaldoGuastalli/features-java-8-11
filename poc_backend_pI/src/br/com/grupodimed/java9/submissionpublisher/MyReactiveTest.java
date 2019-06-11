package br.com.grupodimed.java9.submissionpublisher;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class MyReactiveTest {

    public static void main(String[] args) throws InterruptedException {
        // Criar publicador/editor
        SubmissionPublisher<Empregado> empregadoSubmissionPublisher = new SubmissionPublisher<>();

        // Inscrever o subscriber para o publicador/editor
        MySubscriber mySubscriber = new MySubscriber();
        empregadoSubmissionPublisher.subscribe(mySubscriber);

        List<Empregado> empregados = EmpHelper.getempregados();

        // Publicar itens
        System.out.println("Publicando Itens no publicador");
        empregados.stream().forEach(i -> empregadoSubmissionPublisher.submit(i));

        // lógica para esperar até que o processamento de todas as mensagens acabe
        while (empregados.size() != mySubscriber.getCounter()) {
            Thread.sleep(10);
        }
        // close the Publisher
        empregadoSubmissionPublisher.close();

        System.out.println("Exiting the app");

    }
}
