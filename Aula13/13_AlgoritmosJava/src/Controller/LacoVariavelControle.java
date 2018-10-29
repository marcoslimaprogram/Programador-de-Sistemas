package Controller;

import util.Teclado;

public class LacoVariavelControle {

	public static void main(String[] args) {
		int r, x, i;
		for (i=1; i<=5; i++) {
			x = Teclado.LerInt("Digite um numero: ");
			r = x * 3;
			System.out.println(r);
		
		}
	}
	
}
	