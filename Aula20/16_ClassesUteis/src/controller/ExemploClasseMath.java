package controller;

public class ExemploClasseMath {

	public static void main(String[] args) {

		double valSorteado = Math.random();
		int resultado = 50 + (int) (valSorteado * 30);
		System.out.println("Sorteio entre 50 e 80: " + resultado);

		for (int i = 0; i < 6; i++) {
			double numeroSena = Math.random();
			int numeroSorteado = (int) (numeroSena * 61);
			System.out.println("Numero Sorteado: " + numeroSorteado);
		}

	}
}
