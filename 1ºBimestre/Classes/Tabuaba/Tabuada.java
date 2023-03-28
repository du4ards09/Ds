package Tabuada;

import java.util.Scanner;

public class Tabuada {
	public int i;
	public int numero;
	public int resultado;
	
	public void digitarNum() {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite um número para ser multiplicado:");
		
		numero = leitura.nextInt();
		
		leitura.close();
	}
	
		public void resultadoTab() {
			System.out.println("Resultado:");
			while(i<=10) {
				resultado = i*numero;
				System.out.println(i + "X" + numero + "=" + resultado);
				i++;
				
			} 
		}

}

