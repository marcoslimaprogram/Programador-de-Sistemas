package Controller;

import util.Teclado;

public class BatalhaNaval {

	public static void main (String[] args) {
	
		String arena [] [] = new String [4] [5];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				
						arena [i] [j]="Agua";
						
			}
		}
				
				arena [2] [2]="Barco";
				arena [1] [3]="Submarino";
				arena [3] [3]="Porta-Avioes";
				arena [0] [2]="Navio";
				
			int linha,coluna;
			
							
				linha = Teclado.LerInt("Digite a coordenada da linha: ");
				coluna = Teclado.LerInt("Digite a coordenada da coluna: ");
				
				System.out.println("Voce acertou: "+arena[linha][coluna]);
								
		}
		
}