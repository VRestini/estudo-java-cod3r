package controlador;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String texto;
        do {
            System.out.println("Deseja sair?");
            System.out.print("Diga a palavra mágica: ");
            texto = ent.nextLine();
        }while (!texto.equalsIgnoreCase("sair"));

        ent.close();
    }
}
