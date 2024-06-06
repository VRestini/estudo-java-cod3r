package Lamba;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Ímpar";
        Function<String, String> oResultadoE = result -> "O resultado é: " + result;
        Function<String, String > empolgado = valor -> valor + "!!!";
        Function<String, String > duvida = valor -> valor + "???";

        String resultadoFinal = parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(32);
        System.out.println(resultadoFinal);

        String resultadoFinal2 = parOuImpar
                .andThen(oResultadoE)
                .andThen(duvida)
                .apply(33);
        System.out.println(resultadoFinal2);
    }
}
