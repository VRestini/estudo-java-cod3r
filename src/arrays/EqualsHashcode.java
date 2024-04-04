package arrays;


import java.util.Date;

public class EqualsHashcode {
    public static void main(String[] args) {
        Usuario p1 = new Usuario("Vitor", "vitor@gmail.com");
        Usuario p2 = new Usuario("Vitor", "vitor@gmail.com");

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));

        System.out.println(p1.equals(new Date()));
    }
}
