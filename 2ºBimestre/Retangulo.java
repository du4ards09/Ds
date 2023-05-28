package Figuras;

public class Retangulo extends Formas {
	private double base;
	private double altura;
	
	public Retangulo (double base , double altura) {
		this.altura = altura;
		this.base = base;
	}
	public double calcularArea() {
		return base * altura ;
	}
}
