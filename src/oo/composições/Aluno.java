package oo.composições;

import java.util.ArrayList;

public class Aluno {
    final String nome;
    final ArrayList<Curso> cursos = new ArrayList();

    Aluno(String nome){
        this.nome = nome;
    }
    void AdicionarCurso(Curso curso){
        this.cursos.add(curso);

    }
    Curso ObterCurso(String nome){
        for (Curso curso: this.cursos){
            if (curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Meu nome é " + this.nome;
    }
}
