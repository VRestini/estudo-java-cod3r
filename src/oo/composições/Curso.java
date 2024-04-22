package oo.composições;

import java.util.ArrayList;

public class Curso {
    final String nome;
    ArrayList<Aluno> alunos = new ArrayList<>();
    Curso(String nome){
        this.nome = nome;
    }
    void AdicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

}
