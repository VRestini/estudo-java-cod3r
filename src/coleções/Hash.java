package coleções;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario("Vitor"));
        usuarios.add(new Usuario("Carlos"));
        usuarios.add(new Usuario("César"));

        System.out.println(usuarios.contains(new Usuario("César")));
    }
}
