package br.com.grupodimed.java11.readingwritingstringfiles;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class ReadingWritingStringFilesTeste {

    public static void main(String[] args) {
        Path filePath = Paths.get("/home/local/DOMAINNT/rjguastalli/ronaldoguastalli/features-java-8-11/poc_backend_pI/src/br/com/grupodimed/java11/readingwritingstringfiles/teste.txt");
       try {
           System.out.println("=====================================================================");
           System.out.println("escrevendo com uso de writeString()");
            Files.writeString(filePath, "Olá Java 11 \r\nJava!\r\n", StandardOpenOption.CREATE);

           System.out.println("lendo arquivo com readString()");
            String conteudo = Files.readString(filePath);
           System.out.println("RESULTADO: ");
            System.out.println(conteudo);
           System.out.println("=====================================================================");
        }catch (IOException e) {
            e.printStackTrace();
        }

        Path filePath2 = Paths.get("/home/local/DOMAINNT/rjguastalli/ronaldoguastalli/features-java-8-11/poc_backend_pI/src/br/com/grupodimed/java11/readingwritingstringfiles/data.csv");

//       try {
////           List<Pessoa> pessoas = Files.lines(filePath2)
////                   .skip(1)
////                   .map(e -> e.split(","))
////                   .map(e -> new Pessoa(e[1], e[3], Integer.parseInt(e[6])))
////                   .collect(toList());
////
////           pessoas.forEach(System.out::println);
//
////           Pessoa pessoaMaiorIdade = Files.readString(filePath2).lines()
////                   .skip(1)
////                   .map(e -> e.split(","))
////                   .map(e -> new Pessoa(e[1], e[3], Integer.parseInt(e[6])))
////                   .max(Comparator.comparing(Pessoa::getAge))
////                   .get();
////           System.out.println(pessoaMaiorIdade);
//
//           List<Pessoa> pessoas = Files.readString(filePath2, StandardCharsets.UTF_8).lines()
//                   .skip(1)
//                   .map(e -> e.split(","))
//                   .map(e -> new Pessoa(e[1], e[3], Integer.parseInt(e[6])))
//                   .collect(toList());
//           pessoas.forEach(System.out::println);
//
//           Files.writeString(filePath, pessoas.get(1).getName(), StandardOpenOption.CREATE);
//
//
//       }catch (IOException e){
//           e.printStackTrace();
//       }

    }


}
