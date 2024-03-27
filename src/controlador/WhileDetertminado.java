package controlador;

import javax.swing.*;
import java.util.Scanner;

public class WhileDetertminado {
    public static void main(String[] args) {
        /*int cont = 0;
        while (cont <= 20){
            System.out.printf("x = %d\n", cont);
            cont += 1;
        }*/

        Scanner a = new Scanner(System.in);
        String valor = a.nextLine();
        while (!valor.equalsIgnoreCase("sair")){
            System.out.println("a");
            valor = a.nextLine();}
        a.close();
    }
}
