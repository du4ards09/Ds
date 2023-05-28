package Figuras;

public class App {

	public static void main(String[] args) {
		Formas Triangulo = new Triangulo (4,5);
		double areaTriangulo = Triangulo.calcularArea();
		System.out.println("Área do Triângulo; " + areaTriangulo);
		
		Formas Quadrado = new Quadrado (3);
		double areaQuadrado = Quadrado.calcularArea();
		System.out.println("Área do Quadrado: " + areaQuadrado);
		
		Formas Retangulo = new Retangulo (4,5);
		double areaRetangulo = Retangulo.calcularArea();
		System.out.println("Área do Retângulo: " + areaRetangulo);
		
		Formas Trapezio = new Trapezio (4,5,6);
		double areaTrapezio = Trapezio.calcularArea();
		System.out.println("Área do Trapézio: " + areaTrapezio);

	}

}
