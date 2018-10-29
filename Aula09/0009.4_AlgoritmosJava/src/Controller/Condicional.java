package Controller;

import util.Teclado;

public class Condicional {

	public static void main(String[] args) {
		
		int a, b, x;
		a = Teclado.LerInt("Informe o primeiro numero:");
		b = Teclado.LerInt("Informe o segundo numero:");
		x = a + b;
		if (x > 10) {
		
			System.out.println("O valor da soma e  " + x);
			
			
		} else if(x < 10) {
			
			System.out.println(" A soma dos valores e menor que 10 igual a " + x);
			
				
		} else {
			
			System.out.println(" O valor da soma e igual a " + x);
			
		}
		
	}
}
