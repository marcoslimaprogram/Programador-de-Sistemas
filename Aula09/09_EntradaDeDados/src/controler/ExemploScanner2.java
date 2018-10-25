package controler;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ExemploScanner2 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite com seu Nome: ");
		String s1 = scan.nextLine();
		System.out.println(" Seu Nome e " + s1.toUpperCase ()+ "!");

		System.out.println(" Nome da Cidade: ");
		String s2 = scan.nextLine();
		System.out.println("Sua Cidade e " + s2);

		System.out.println("Digite Um Numero: ");
		int x = scan.nextInt();

		System.out.println("Digite Seu Salario: ");
		double salario = scan.nextDouble();

		System.out.println(" Salario e " + salario );

		scan.close();

		System.out.println("The End.");

		
	}
}