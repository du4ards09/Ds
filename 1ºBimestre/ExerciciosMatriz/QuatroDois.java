import java.util.Scanner;
public class QuatroDois {

	public static void main(String[] args) {
		
		// Chamando o Scanner
		Scanner leitura = new Scanner(System.in);
		
		// Declaração da matriz 
		int matriz[][] = new int [4][2];
		
		//Laços pra preencher a matriz 
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println("Digite um número:");
				matriz[i][j] = leitura.nextInt();
			}
		}
		
		// Declaração da variável soma
		int soma;
		
		System.out.println();
		System.out.println();
		
		// Exibição da matriz 
		for(int i = 0; i < 4; i++) {
			System.out.println();
			soma = 0;
			for(int j = 0; j < 2; j++) {
				soma = soma  + matriz[i][j]; 
				System.out.print("["+matriz[i][j] + "]");
				}
			
			// Exibição da soma da linha
			System.out.println("  O resultado da soma da linha " + i + " é : " + soma);
		}
		leitura.close();

	}

}
