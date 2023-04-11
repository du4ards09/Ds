package tabuada;

import java.util.Scanner;

public class Tabuada { 
	public int resultado;
	public int inicio;
	public int termino;
	
	public void digitarN() {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite o intervalo: ");
		inicio = leitura.nextInt();
		System.out.println("Digite o termino:");
		termino = leitura.nextInt();
		
		
		leitura.close();
	}
    
    public void calcularTabuada() {
	    	while (inicio <= termino) {
	    		System.out.println(" ");
	    		System.out.println("Tabuada do: " + inicio);
	    		System.out.println(" ");
		    	for(int i= 1; i <= 10; i++) {
	          
		          resultado = i * inicio;
		          System.out.println(inicio + "  x  " + i + "  =  " + resultado);
	          
	          
		    } 
		    	
		    inicio++;
		    
	    	}  
   }
}
    

