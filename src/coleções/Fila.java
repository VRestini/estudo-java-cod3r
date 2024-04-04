package coleções;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>(); // primeiro a entrar primeiro a sair
        // offer e add adicionam, mas tem comportamento diferente quando a fila tá cheia
        fila.add("Vitor"); // retorna false
        fila.offer("José"); // dá erro
        fila.add("Mario");
        fila.offer("Maria");
        fila.add("João");
        fila.offer("Antonia");

        System.out.println(fila.peek()); // se estiver vazio manda null, se a fila estiver vazia
        System.out.println(fila.peek());
        System.out.println(fila.element()); // se estiver vazio dá erro, se a fila estiver vazia
        System.out.println(fila.element());

        System.out.println(fila.poll()); // retorna null, se a fila estiver vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // dá erro, se a fila estiver vazia
        System.out.println(fila.remove());
    }
}
