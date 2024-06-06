package Lamba;

public class CalculoTesteEu{
    public static void main(String[] args) {
        Calculo2 soma = (x, y) -> x + y;
        System.out.println(soma.executa(4, 6));

    }
}
