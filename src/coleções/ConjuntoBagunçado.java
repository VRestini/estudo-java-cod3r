package coleções;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
    @SuppressWarnings({"rawtypes", "unchecked"}) // serve para tirar os avisos
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho do Set é: " + conjunto.size());
        conjunto.add(1);
        conjunto.add(true);
        System.out.println("Tamanho do Set é: " + conjunto.size()); // não muda pois um set nn permite valores iguais

        System.out.println(conjunto.remove("teste")); // nn removeu pois nn existe no set
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));
        System.out.println("Tamanho do Set é: " + conjunto.size());

        System.out.println(conjunto.contains("Teste")); // nn existe mais no set, foi retirado
        System.out.println(conjunto.contains(1.2));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); // junta tudo, mas nn repete valor
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
