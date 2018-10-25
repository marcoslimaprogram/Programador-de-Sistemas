package controler;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ExemploScanner {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter yuor name: ");
		String s1 = scan.nextLine();
		System.out.println("your name is " + s1);

		System.out.println("city name: ");
		String s2 = scan.nextLine();
		System.out.println("your name is " + s2);

		System.out.println("Enter whole nember: ");
		int x = scan.nextInt();

		System.out.println("Enter double value: ");
		double y = scan.nextDouble();

		System.out.println("Number are " + x + " and " + y + " and their product is " + (x * y));

		scan.close();

		System.out.println("The End.");

	}
}