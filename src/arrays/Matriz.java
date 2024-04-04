package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int amountStd = 0;
        int amountNote = 0;
        double average = 0;
        double sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        amountStd = input.nextInt();

        System.out.print("Digite a quantidade de notas por aluno: ");
        amountNote = input.nextInt();
        double [][] arrayNote = new double[amountStd][amountNote];
        for (int i = 0; i < amountStd; i++) {
            for (int j = 0; j < amountNote; j++) {
                System.out.println("Digite a nota: ");
                arrayNote[i][j] += input.nextDouble();
                sum += arrayNote[i][j];
            }
        }
        average = sum / (amountStd * amountNote);
        System.out.printf("\n A média é: %.2f", average);
        input.close();
    }
}
