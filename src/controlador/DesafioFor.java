package controlador;

public class DesafioFor {
    public static void main(String[] args) {
        String valor ="#";
        for (String i = "a"; !i.equalsIgnoreCase("aaaaaa"); i += "a"){
            System.out.println(valor);
            valor+="#";
        }
    }
}
