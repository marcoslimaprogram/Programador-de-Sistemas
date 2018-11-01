package controller;

public class EscopoDeVariavel {
	
	static int x = 1; //variavel global 
	
	public static void main(String[] args) {
		int x = 5;
		System.out.println("x no inicio de main () e " + x);
		
		metodoA();
		metodoB();
		
		}
	
		public static void metodoA() {
		int x = 25;
		System.out.println("Variavel local x ao entrar no metodoA e " + x);
		x = x + 1;
		System.out.println("variavel local x antes de sair do metodo e " + x);
		
			}
		
		public static void metodoB() {
			System.out.println("Variavel x ao entrar no metodoB e " + x + " global.");
			x = x*10;
			System.out.println("Variavel x antes de sair do metodo e "+x);
			
			
			
			
			
		}
}

