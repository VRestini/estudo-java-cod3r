package Lamba;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;

        Produto p1 = new Produto("Celular", 2000.00, 0.2);
        Produto p2 = new Produto("Celular", 2000.00, 0.9);
        System.out.println(isCaro.test(p1));
        System.out.println(isCaro.test(p2));
        System.out.println();
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isMaior3Digitos = num -> num >= 100 && num <= 999;
        System.out.println(isPar.and(isMaior3Digitos).test(23));
        System.out.println(isPar.or(isMaior3Digitos).test(22));
    }
}
