import java.util.Scanner;
public class InverteNumero {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro de três dígitos: ");
	        int numero = scanner.nextInt();

	        scanner.close();

	        int centenas = numero / 100;
	        int dezenas = (numero % 100) / 10;
	        int unidades = numero % 10;

	        int numeroInvertido = unidades * 100 + dezenas * 10 + centenas;

	        System.out.println("O número invertido é: " + numeroInvertido);
	    }

		

	}


