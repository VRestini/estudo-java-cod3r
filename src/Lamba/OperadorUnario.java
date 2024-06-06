package Lamba;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> soma = num -> num + 2;
        UnaryOperator<Integer> mult = num -> num * 2;
        UnaryOperator<Integer> potencia = num -> num * num;

        Integer resultadoFinal = soma
                .andThen(mult)
                .andThen(potencia)
                .apply(2);
        System.out.println(resultadoFinal);

        Integer resultadoFinal2 = potencia // faz a msm coisa mas ao contrário
                .compose(mult)
                .compose(soma)
                .apply(2);
        System.out.println(resultadoFinal2);
    }
}
