package Lamba;

import java.util.Arrays;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Vitor", "Vitu", "Vit");

        System.out.println("For Each norma");
        for (String nome: aprovados){
            System.out.println(nome);
        }
        System.out.println("\nLamba #01");
        aprovados.forEach(nome -> System.out.println(nome));

        System.out.println("\nMethod Reference");
        aprovados.forEach(System.out::println);

        System.out.println("\nLamba #02");
        aprovados.forEach(nome -> imprimirNomes(nome));

        System.out.println("\nMethod Reference 02");
        aprovados.forEach(forEach::imprimirNomes);
    }
    static void imprimirNomes( String nome){
        System.out.println(nome);
    }
}
