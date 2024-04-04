package coleções;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) { // ultimo a entrar primeiro a sair
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O Hobbit");
        livros.add("A Arte da Guerra");
        livros.push("O Caibalion");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.pop());
        System.out.println(livros.poll()); // retorna null se estiver vazio
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        //System.out.println(livros.remove()); // dá erro se estiver vazio
        // System.out.println(livros.pop()); // da erro se estiver vazio

    }
}
