package operadores;

import javax.swing.border.MatteBorder;

public class DesafioAritmetico {
	public static void main(String[] args) {
		int num1 = (6*(3+2));
		int num2 = (int) Math.pow(num1, 2)/(3*2);
		System.out.println(num2);
		
		int num3 = (1-5) * (2-7);
		int num4 = (int) Math.pow(num3,2)/2;
		System.out.println(num4);
		
		int num5 = (int) Math.pow(num4 - num2, 3);
		System.out.println(num5/(int) Math.pow(10, 3));
		// int b = (int) Math.pow(num1, num1);
	}
}
