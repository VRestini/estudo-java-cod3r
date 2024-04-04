package coleções;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjundoComportado {
    public static void main(String[] args) {
        Set<String> listaAprovados = new HashSet<String>();
        // Set<String> listaAprovados = new TreeSet<String>(); // ordena em ordem alfabética
        //<String> = todos os itens do set devem ser String
        listaAprovados.add("Vitor");
        listaAprovados.add("Pedro");
        listaAprovados.add("Ximbinha");
        listaAprovados.add("Tchan");

        for (String candidatos: listaAprovados){
            System.out.println(candidatos);
        }
        Set <Integer> numns = new HashSet<>();
        numns.add(1);
        numns.add(2);
        numns.add(3);
        for (int number: numns){
            System.out.println(number);
        }
    }
}
