package controler;

import model.Pessoa;

public class Cadastro {

	public static void main (String [] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Leandro Ferra");
		pessoa.setIdade(28);
		pessoa.setSexo("Masculino");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Sexo: " + pessoa.getSexo());
		
		Pessoa people = new Pessoa();
		 people.setNome("Marilda");
		 people.setIdade(50);
		 people.setSexo("Feminina");
		System.out.println("Nome: " +  people.getNome());
		System.out.println("Idade: " +  people.getIdade());
		System.out.println("Sexo: " +  people.getSexo());
		
		
		
		
	}
	
	
}
