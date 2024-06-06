package Lamba;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Pratica {
    public static void main(String[] args) {
        Produto p1 = new Produto("Ipad", 3235.89, 0.13);
        Produto p2 = new Produto("Smartphone", 5000.00, 0.13);
        Produto p3 = new Produto("Notebook", 2000.89, 0.13);
        Produto p4 = new Produto("Mac", 10000.89, 0.13);
        List<Produto> teste = Arrays.asList(p1, p2, p3, p4);
        teste.forEach(exibir -> System.out.println(exibir));

    }
}
