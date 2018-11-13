package controller;

import util.Teclado;

public class ComTratamentoDeErro {

	public static void main(String[] args) {
		int count = 0;
		int maxTries = 3;
		while (true) {

		try {
			double a = Teclado.lerDouble("Digite o Numerador: ");
			double b = Teclado.lerDouble("Digite o Denominador: ");
			double c = a / b;
			System.out.println("Resultado da divisao de a por b: " + c);
		} 
		
		catch (NumberFormatException nfe) {
			System.out.println("Caracter invalido!");
						if (++count == maxTries) {
							System.out.println("Numero de tentativas excedido");
							System.exit(1);
							
							// Este tratamento abaixo so funciona para versoes anteriores ao Java 6
							//catch (ArithmeticException ae) {
								System.out.println("Divisao por Zero");
						}	
							else
						{
							continue;
							
						}//Fim if
						
			}//Fim do catch
			
			}
						
		}
}

