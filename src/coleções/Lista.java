package coleções;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        Usuario u1 = new Usuario("Vitor");
        lista.add(u1);
        lista.add(new Usuario("Maria"));
        lista.add(new Usuario("César"));
        lista.add(new Usuario("Jesus"));
        lista.add(new Usuario("José"));
        System.out.println(lista);
        System.out.println(lista.get(3)); // acessar pelo índice

        System.out.println(lista.remove(1)); // objeto
        System.out.println(lista.remove(new Usuario("César"))); // boolean
        System.out.println(lista);

        System.out.println(lista.contains(u1));
        System.out.println(lista.contains(new Usuario("José")));
    }
}
