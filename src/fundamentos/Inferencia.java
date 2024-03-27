package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		// aula sobre inferencia e tipos primitivos
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		c = "outro texto";
		System.out.println(c);
		// c =4.5; ERRADO, NÃO PODE MUDAR O TIPO
		
		double d; //declarei a variavel
		d = 123.5;// iniciei a variavel
		System.out.println(d);
		
		
	}
}
