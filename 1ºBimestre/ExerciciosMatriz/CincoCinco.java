import java.util.Scanner;
public class CincoCinco {

	public static void main(String[] args) {
		// Chamando o Scanner
		Scanner leitura = new Scanner(System.in);
		// Declaração da matriz 
				int matriz[][] = new int [5][5];
		//Laços pra preencher a matriz 
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println("Digite um número:");
				matriz[i][j] = leitura.nextInt();
			}
		}
		
		System.out.println();
		System.out.println();
		
		// Exibição dos elementos da diagonal principal da matriz 
		System.out.print("Os elementos da diagonal principal são: ");
		for (int i = 0; i < 5; i++) {
            System.out.print("["+matriz[i][i] + "]" + " ");
        }
		
		leitura.close();
		
	}

}
