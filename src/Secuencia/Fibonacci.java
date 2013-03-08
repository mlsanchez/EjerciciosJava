package Secuencia;

public class Fibonacci {

	 public static void main(String arg[]){
		 Integer numero=0,numero2=1,suma=0;
			for (Integer x =0;x <= 2000000;x++){
				x= numero + numero2;
				numero=numero2;
				numero2=x;	
			if(x%2 == 0) {
					suma+=x;
			
			if(suma<=4000000){
						System.out.println(suma);
					 }
			     }		
			}		
			System.out.println("Resultado "+suma);

		}
	 }
