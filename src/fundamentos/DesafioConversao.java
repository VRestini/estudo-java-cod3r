package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner recebe = new Scanner(System.in);
		String num1 = recebe.nextLine().replace(",",".");
		String num2 = recebe.nextLine().replace(",",".");
		String num3 = recebe.nextLine().replace(",",".");
		recebe.close();
		double sal1 = Double.parseDouble(num1);
		double sal2 = Double.parseDouble(num2);
		double sal3 = Double.parseDouble(num3);
		var media = ((sal1+sal2+sal3)/3);
		//System.out.println("A média do salário é:" + media);
		System.out.printf("a sua média é %.2f ", media);
	}
	
}
