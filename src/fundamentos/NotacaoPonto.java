package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		// a notação ponto serve pra usar os métodos
		//tipos primitivos nn tem o operador "."
		double a =2.3;
		String s = "aaaa";
		// s.toUpperCase(); desse jeito ele nn armazena a mudança na variavel, só nessa linha
		s=s.toUpperCase(); //assim armazena na variavel
		System.out.println(s);
		
		s=s.replace("A", "Senhor");
		System.out.println(s);
		
		s=s.concat("!!!");
		System.out.println(s);
		
		System.out.println("vitor".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Vitor")
				.toUpperCase();
		System.out.println(y);
	}
}
