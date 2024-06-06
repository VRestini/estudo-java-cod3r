package Lamba;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        BinaryOperator<Double> soma = (x, y) -> x + y;
        System.out.println(soma.apply(2.0,3.0));

        BinaryOperator<Integer> mult = (x, y) -> x * y;
        System.out.println(mult.apply(2,3));


    }
}
