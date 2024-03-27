package controlador;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite a média: ");
        double media =  ent.nextDouble();
        ent.close();
        if (media <= 10 && media >= 7)
            System.out.println("aprovado");
        if (media < 7 && media >=4.5)
            System.out.println("reprovado");
        Boolean criterioAvaliacao = media < 4.5 && media >= 0;
        if (criterioAvaliacao)
            System.out.println("burro");
    }
}
