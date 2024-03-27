package fundamentos;

import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Integer n1 = 1 ;//entrada.nextInt();
        Integer n2 = 2 ;//entrada.nextInt();
        Integer n3 = 0 ;//entrada.nextInt();
        Integer n4 = 4 ;//entrada.nextInt();
        Integer aux = 0;
        Integer aux2 = 0;
        entrada.close();
        /*  ERRO
        String resultado = n1.equals(n2) ? "Igual" : "";
        resultado = n2.equals(n3) ? "Igual" : "Diferente";
        resultado = n3.equals(n4) ? "Igual" : "Diferente";
        */
        /*if (n1.equals(n2))
            if (n2.equals(n3))
                if (n3.equals(n4))
                    System.out.println("Igual");
                else
                    System.out.println("Diferente");
            else
                System.out.println("Diferente");
        else
            System.out.println("Diferente");
    */
        // System.out.println(n1.toString().getClass());

        if (n1.equals(1))
            System.out.println("aaa");
        if (n2.equals(n2.equals(0)))
            aux2 = n2;



    }

}
