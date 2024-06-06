package Lamba;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        Function<Double, String> aprovadoo = n1 -> n1 >= 7 ? "Aprovado" : "Reprovado";

        BiFunction<Double, Double, String> aprovado = (n1, n2) ->{
        double notaFinal = (n1 + n2)/2;
        return notaFinal >= 7 ? "Aprovado" : "Reprovado";};

        System.out.println(media.andThen(aprovadoo).apply(7.5, 7.4));
        System.out.println(aprovado.apply(8.0, 6.7));
    }
}
