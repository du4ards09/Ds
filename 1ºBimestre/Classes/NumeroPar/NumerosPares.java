package NumerosPares;
import java.util.ArrayList;
import java.util.Collections;

public class NumerosPares {
	
	public void apresentarN(){
		   ArrayList<Integer> numerosPares = new ArrayList<Integer>();
		      for (int i = 0; i <= 100; i++) {
		          if (i % 2 == 0) {
		              numerosPares.add(i);
		            }
		        }
		        Collections.sort(numerosPares, Collections.reverseOrder());
		        for (Integer numero : numerosPares) {
		            System.out.println(numero);
		        }
		    }

	}
