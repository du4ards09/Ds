
import  java.util.Scanner;
public class DescInss2 {

	public static void main(String[] args) {
			
		Scanner  leitura = new  Scanner (System.in);
		
        
            
            double  salario = 0; 
            int numA, horaA;
            System.out.println ( "Digite a qdte de hora aula do professor(a):" );
            horaA = leitura.nextInt ();
            System.out.println ( "Digite o número de aulas do professor(a):" );
            numA= leitura.nextInt ();
            
            if ( salario <= 1212.01 ) {
                salario = (numA * horaA) - 0.075 ;
                System.out.println( "O salário com o desconto do INSS será de: R$ " + salario );
                
            } else if  ( salario < 2427.36 ) {
                salario = (numA * horaA) - 0.09 ;
                System.out.println( "O  salário com o desconto do INSS será de: R$ " + salario );
            }else if ( salario < 3641.04 )  {
            	salario = (numA * horaA) - 0.12 ;
                System.out.println( "O  salário com o desconto do INSS será de: R$  " + salario );
            }else if ( salario < 7087.22 )  {
            	salario = (numA * horaA) - 0.14 ;
                System.out.println( "O  salário com o desconto do INSS será de: R$  " + salario );
            }else if ( salario < 12136.79 )  {
            	salario = (numA * horaA) - 0.145 ;
                System.out.println( "O  salário com o desconto do INSS será de: R$  " + salario );
            }else if ( salario <24273.57 )  {
            	salario = (numA * horaA) - 0.165 ;
                System.out.println( "O  salário com o desconto do INSS será de: R$ " + salario );
            }else if ( salario < 47333.46 )  {
            	salario = (numA * horaA) - 0.19 ;
                System.out.println( "O  salário com o desconto do INSS será de: R$ " + salario );
            }else  {
            	salario = (numA * horaA) - 0.22 ;
                System.out.println( "O  salário com o desconto do INSS será de: R$ " + salario );   
            
            }
       	
       
	}

}