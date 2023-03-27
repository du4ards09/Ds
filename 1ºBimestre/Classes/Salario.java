package salario;

import java.util.Scanner;

public class Salario {
	public double salario;
	public double porcentagem;
	
	public void digitarS() {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salario = leitura.nextDouble();
		
		leitura.close();
	}
	public double calcularSalario() {
		if(salario < 3000) {
			porcentagem = (salario/100)*10;
			salario = salario + porcentagem;
			return salario;
		}else {
			porcentagem = (salario/100)*20;
			salario = salario + porcentagem;
			return salario;
		}
	}
}
