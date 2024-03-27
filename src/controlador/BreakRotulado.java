package controlador;

public class BreakRotulado {
    public static void main(String[] args) {
        externo: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                if (i==3){
                    break externo; // serve pra quebrar um for de hierarquia maior
                }
            }
            System.out.println();
        }
    }
}
