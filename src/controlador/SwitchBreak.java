package controlador;

import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int i = ent.nextInt();
        String conceito ="";
        switch (i){
            case 10: case 9: {
                conceito = "a";
                break;
            }
            case 8: case 7: {
                conceito = "b";
                break;
            }
            case 6: case 5: {
                conceito = "c";
                break;
            }
            default:
                System.out.println("Burro");
        }
        System.out.println("O conceito é:" + conceito);
    }
}
