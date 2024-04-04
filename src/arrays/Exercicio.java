package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double [] notasAlunoA = new double[4];
        double totalAluno = 0;
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1]= 8;
        notasAlunoA[2]= 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        for (int i = 0; i < notasAlunoA.length; i++){
            totalAluno += notasAlunoA[i];
        }

        System.out.println(totalAluno);

        double[] notasAlunoB = {6.9, 3.0};
        System.out.println(Arrays.toString(notasAlunoB));
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAluno += notasAlunoB[i];
        }
        System.out.println(totalAluno);
    }
}
