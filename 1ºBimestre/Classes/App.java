package salario;

public class App {

	public static void main(String[] args) {
		
		Salario s = new Salario();
		
		s.digitarS();
		System.out.println("O salario final é: " + s.calcularSalario());
		
	}

}
