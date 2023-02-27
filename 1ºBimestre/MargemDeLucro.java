
import java.util.Scanner;
public class MargemDeLucro {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
	
				int resposta;
				double preco, lucro, venda;

		        do{
		        	System.out.println("Digite o valor do produto:");
		            preco = leitura.nextDouble();

		            System.out.println("Digite a margem de lucro do produto em %:");
		            lucro = leitura.nextDouble();

		            venda = ((lucro / 100) * preco) + preco;
		            System.out.println("O produto foi vendido por: R$" + venda);

		            System.out.println("Deseja continuar a execu��o? S - 1, N -2");
		            resposta = leitura.nextInt();
		        }while (resposta!=2);
      }
	
}



