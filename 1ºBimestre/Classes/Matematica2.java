
public class Matematica2{
		public double nUm;
		public double nDois;
		public double resultado;
		
		//Com parâmetro sem retorno
		public void calcularAdicao(double nUm, double nDois){
			resultado = nUm + nDois;
	    }
		
		//Com parâmetro com retorno
		public double calcularSubtracao(double num1,double nDois) {
			
			resultado = nUm - nDois;
			return resultado;
	    }
		
		//Sem parâmetro sem retorno
		public void calcularMultiplicacao(){
			resultado = nUm * nDois;
	    }
		
		//Sem parâmetro com retorno
		public double calcularDivisao(){
			resultado = nUm/nDois;
			return resultado;
		}
}


