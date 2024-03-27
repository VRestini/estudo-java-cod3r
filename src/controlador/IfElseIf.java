package controlador;

import javax.swing.*;

public class IfElseIf {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(
                "Informe:");
        Integer b = Integer.parseInt(a);
        String c = JOptionPane.showInputDialog(
                "Fala um dia ae comédia"
        );
        // Integer d = Integer.parseInt(c);
        if (c.equals("Domingo"))
            System.out.println("1");
        else if (c.equals("Segunda")) {
            System.out.println("2");
        } else if (c.equals("Sabado")) {
            System.out.println("7");
        }

        if (b <= 10 && b >=0)
            if (b>= 8.0)
                System.out.println("Bão");
            else if (b>= 6.0)
                System.out.println("Marromeno");
            else
                System.out.println("burro");

    }
}
