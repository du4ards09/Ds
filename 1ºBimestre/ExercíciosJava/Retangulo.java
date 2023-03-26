import java.util.Scanner;
public class Retangulo {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int b, h,area,p;
		System.out.println("Digite a base do retângulo:");
		b=leitura.nextInt();
		System.out.println("Digite a altura:");
		h=leitura.nextInt();
		area = b*h;
		p = ((2*b) + (2*h));
		System.out.println("A area do retângulo é:" +area);
		System.out.println("O seu perimetro será de:" +p);
	}

}
