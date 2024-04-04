package coleções;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        // o put ele adiciona, mas se já existir ele substitui
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Vitor");
        usuarios.put(20, "José");
        usuarios.put(3, "Maria");
        usuarios.put(4, "César");

        System.out.println(usuarios.size());
        // System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); // mostra as chaves
        System.out.println(usuarios.values()); // mostra os valores
        System.out.println(usuarios.entrySet()); // mostra tudo

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Vitor"));

        System.out.println(usuarios.get(4)); // busca pelo "índice"

        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        for (String nome: usuarios.values()){
            System.out.println(nome);
        }
        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }

    }
}
