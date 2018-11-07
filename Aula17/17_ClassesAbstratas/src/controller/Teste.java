package controller;

import model.*;

public class Teste {

	public static void main(String[] args) {
		
		//Usuario usu = new Usuario();
	
		Professor prof = new Professor("usuario", "1510", 10, "Jose Carlos", "Mestre em TI", 101010);
		Professor prof2 = new Professor("usuario", "1510", 10, "Jose Carlos", "Mestre em TI", 101010);
				
				prof.mostrar();
				System.out.println("==============================================");
				
				prof2.mostrar();		
				System.out.println("==============================================");

		Aluno aluno = new Aluno("muzi", "muzi123", 1, "Sergio Muzi", "primeiro", "tarde", 32115);
		aluno.mostrar();

	}

	// Aluno aluno = new Aluno();

}
