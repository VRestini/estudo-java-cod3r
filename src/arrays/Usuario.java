package arrays;

import java.security.PublicKey;
import java.util.Objects;

// classe criada para testar equals e hashcode
public class Usuario {
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    String nome;
    String email;
    @Override
    public boolean equals(Object objeto) { // JEITO FEITO NA AULA

        if (objeto instanceof Usuario) { // verificar se o objeto é da mesma classe,
            // por exemplo: comparar se o nome de um usuário é igual ao nome de um usuário,
            // não comparar o nome de um usuário com a hora de uma data
            Usuario outro = (Usuario) objeto; // cast

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }


    /* Equal e hashcode do intellij
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    } */
}
