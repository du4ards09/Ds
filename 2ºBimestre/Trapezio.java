package Figuras;

public class Trapezio extends Formas {
	private double baseMenor;
	private double baseMaior;
	private double altura;
	
	public Trapezio(double baseMenor,double baseMaior,double altura) {
		this.altura = altura;
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
	}
	public double calcularArea() {
		return ((baseMaior + baseMenor )* altura)/2;
	}

}
