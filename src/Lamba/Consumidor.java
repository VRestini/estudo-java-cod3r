package Lamba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = produto -> System.out.println(produto.nome);
        Produto p1 = new Produto("Bike", 1000.00, 0.15);
        Produto p2 = new Produto("Celular", 1000.00, 0.15);
        Produto p3 = new Produto("Pc", 1000.00, 0.15);
        Produto p4 = new Produto("Brinco", 1000.00, 0.15);
        Produto p5 = new Produto("Caneta", 1000.00, 0.15);
        List<Produto> prod = Arrays.asList(p1, p2, p3, p4, p5);

        imprimirNome.accept(p1);
        System.out.println("");
        prod.forEach(imprimirNome);
        prod.forEach(p -> System.out.println(p.nome));
        prod.forEach(System.out::println);
    }
}
