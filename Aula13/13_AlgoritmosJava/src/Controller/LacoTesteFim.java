package Controller;

import util.Teclado;

public class LacoTesteFim {

	public static void main(String[] args) {
		int r, x, i;
		i = 1;
		do {
			x = Teclado.LerInt("Digite um numero: ");
			r = x * 3;
			System.out.println(r);
			i = i + 1;
		}while (i <= 5);
	}
	
}
		
				
	
