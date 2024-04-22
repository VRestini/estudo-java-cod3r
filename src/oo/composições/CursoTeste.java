package oo.composições;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Vitor");
        Aluno aluno02 = new Aluno("Zé");
        Aluno aluno03 = new Aluno("Catatau");

        Curso curso01 = new Curso("Java");
        Curso curso02 = new Curso("Sql");
        Curso curso03 = new Curso(".NetMAUI");

        curso01.AdicionarAluno(aluno01);
        curso01.AdicionarAluno(aluno02);
        curso02.AdicionarAluno(aluno01);
        curso02.AdicionarAluno(aluno03);

        for (Aluno aluno: curso02.alunos){
            System.out.println("Estou matriculado no curso " + curso02.nome+ " e me chamo "+aluno.nome);
        }
        System.out.println(aluno01.cursos.get(0).alunos);

        Curso cursoAchado = aluno01.ObterCurso("Java");
        if (cursoAchado !=null){
            System.out.println(cursoAchado.nome);
            System.out.println(cursoAchado.alunos);
        } // aula parada no minuto 20
    }
}
