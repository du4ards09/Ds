package Potencia;

import java.util.Scanner;

public class Potencia {
	public int n1 , n2;
	
	public void apresentar(){
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o númro da base: ");
		n1 = leitura.nextInt();
		System.out.println("Digite o númro do expoente: ");
		n2 = leitura.nextInt();
		
		System.out.println(exibir(n1,n2));
		
		leitura.close();
	}
	
	public int exibir(int x, int y) {
		if(x == 0 || x == 1)
		return x;
		
		int total = x;
		
		for(int i = 1; i<y; i++) {
			total *=x;
		}
		return total;
		
	}

}
