package Figuras;

public class Triangulo extends Formas {
	private double base;
	private double altura;
	
	public Triangulo(double base , double altura) {
		this.altura = altura;
		this.base = base;
	}
	public double calcularArea() {
		return (base * altura)/2;
	}

	
}
