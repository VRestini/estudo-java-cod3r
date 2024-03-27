package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        String op = entrada.next();

        entrada.close();
        int resultado = "+".equals(op) ? n1 + n2 :0;
        resultado = "-".equals(op) ? n1 - n2 :resultado;
        resultado = "*".equals(op) ? n1 * n2 :resultado;
        resultado = "/".equals(op) ? n1 / n2 :resultado;
        System.out.println(resultado);
    }
}
