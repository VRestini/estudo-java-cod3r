package controlador;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Integer nota;
        Double cont = 0.0;
        Double total = 0.0;
        Double med;
        do {
            System.out.print("Digite a nota:");
            nota = ent.nextInt();
            if (nota > 10 || nota < -1){
                System.out.println("Erro!");
                System.out.print("Digite a nota novamente:");
                nota = ent.nextInt();
            }
            cont++;
            total = total + nota;
        }while(nota != -1);
        total++;
        cont--;
        med = total / cont;
        System.out.println("A média é: "+ med);
        ent.close();
    }
}
