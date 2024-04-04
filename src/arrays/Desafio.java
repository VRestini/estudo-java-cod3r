package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        double[] arrayZero = new double[0];
        int lengthArray = 0;
        double note = 0;
        double average = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        lengthArray = input.nextInt();
        double[] arrayNote = new double[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Digite a nota: ");
            note = input.nextDouble();
            arrayNote[i] = note;
        }
        System.out.println(Arrays.toString(arrayNote));

        for (int i = 0; i < lengthArray; i++) {
            average += arrayNote[i];
        }
        System.out.printf("A média é: %.2f", average/lengthArray);
        input.close();
    }
}
