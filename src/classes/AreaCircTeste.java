package classes;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        AreaCirc a2 = new AreaCirc(10);

        // sempre que uma parte do código estiver em itálico significa que é um atributo static
        // a2.pi = 4; assim vc muda o valor de pi para todos objetos
        //AreaCirc.PI = 3.1415; jeito certo de mudar o valor static
        System.out.println(AreaCirc.area(10)); // aqui eu fiz um método static na classe, ent nn preciso instanciar
        System.out.println(a1.area());
        System.out.println(a2.area());
    }
}
