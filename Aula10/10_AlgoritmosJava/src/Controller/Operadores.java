package Controller;

import util.Teclado;

public class Operadores {

	
	public static void main(String[] args) {
		 //nome;
		 String nome = Teclado.LerTexto(" Digite seu nome; ");
		
		int nota1;
		nota1 = Teclado.LerInt(" Digite nota1: ");
		
		int nota2;
		nota2 = Teclado.LerInt(" Digite nota2: ");
		
		int nota3;
		nota3 = Teclado.LerInt(" Digite nota3: ");
		
		int nota4;
		nota4 = Teclado.LerInt(" Digite nota4: ");
		
		
		System.out.println("Nome informado : " + nome);
		
		System.out.println("nota informada : " + nota1);
		System.out.println("nota informada : " + nota2);
		System.out.println("nota informada : " + nota3);
		System.out.println("nota informada : " + nota4);
		System.out.println("media: " + (nota1 + nota2 + nota3 + nota4)/4);
		
	}
}
