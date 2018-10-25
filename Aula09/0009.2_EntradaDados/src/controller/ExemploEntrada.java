package controller;
import util.Teclado;
public class ExemploEntrada {
	
	public static void main(String[] args) {
		 //nome;
		 String nome = Teclado.LerTexto(" Digite seu nome; ");
		
		int idade;
		idade = Teclado.LerInt(" Digite sua idade: ");
		
		double salario;
		salario = Teclado.lerDouble(" Digite seu salario ");
		
		System.out.println("Nome informado : " + nome);
		System.out.println("Idade informada : " + idade);
		System.out.println("Salario informado : " + salario);
	}

}

 