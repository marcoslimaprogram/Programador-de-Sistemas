package Controller;


public class SobrecargaMetodo {

    int idade;
	String nome;
	
	public static void main(String[] args) {
		
		
		SobrecargaMetodo scm = new SobrecargaMetodo();
		
		scm.cadastrarPessoa(50);
		scm.cadastrarPessoa("Gilberto");
		scm.cadastrarPessoa(35, "Maria Helena");
		
		
		//System.out.println("sobreCarga de Metodo");
		
	
	}
	
	
	
	private void cadastrarPessoa(int valor) {
		// TODO Auto-generated method stub

		idade=valor;
		System.out.println("Idade: " + idade);
		
	}

	private void cadastrarPessoa(String valor) {
		// TODO Auto-generated method stub

		nome=valor;
		System.out.println("Idade: " + nome);
		
		
	}

	private void cadastrarPessoa(int valor1 , String valor2) {
		// TODO Auto-generated method stub
        idade = valor1;
        nome  = valor2;

		
		System.out.println("idade: " + idade + " - Nome" + nome);
		
		



}
}

