package Figuras;

public class Quadrado extends Formas {
	private double lado;
	
	public Quadrado (double lado) {
		this.lado = lado;
	}
	public double calcularArea() {
		return lado * lado;
	}
	
}
