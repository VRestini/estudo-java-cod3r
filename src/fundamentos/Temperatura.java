package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F -32 x 5/9 = C
		final double AUX = 32;
		final double MULT = 5/9.0;
		double faren = 89;
		double celsius = (faren - AUX) * MULT;
		System.out.println("A temperatura em graus celsius é de: " + celsius);
		
		faren = 150;
		celsius = (faren - AUX) * MULT;
		System.out.println("A temperatura em graus celsius é de: " + celsius);
		
		
	}

}
