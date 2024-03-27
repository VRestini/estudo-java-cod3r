package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionario
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 642;
		int id = 56454;
		long pontosAcumulados= 4_234_835_223L; // o L serve pra mostrar pro java que esse literal nn é um int e sim um long
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2+991+797+103.01;
		
		boolean estaDeFerias = true;
		
		char status = 'a';
		
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numerosDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + "ganha: " + salario);
		System.out.println("Férias: " + estaDeFerias);
		System.out.println("Status: "+ status);
	}
}
