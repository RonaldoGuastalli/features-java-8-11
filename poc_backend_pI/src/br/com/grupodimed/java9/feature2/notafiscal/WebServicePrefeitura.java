package br.com.grupodimed.java9.feature2.notafiscal;

public class WebServicePrefeitura {

    public static void emitir(NotaFiscal notaFiscal) {
        try {
            String thread = Thread.currentThread().getName();
            System.out.println("emitindo na thread " + thread);
            System.out.println("emitindo...");
            Thread.sleep(5000);
            System.out.println("<<< depois de 5 segundos >>>");
            System.out.println("emitido!");
        }catch ( Exception e) {
            System.out.println("falha ao emitir a notaFiscal");
        }
    }
}
