package NumRomanos;

import java.util.Scanner;

public class Opcion extends ConvertidorNum{
	
    public static void main(String... args) {  
    	 Scanner sc = new Scanner( System.in );
    	 
    	 System.out.println("Seleciona una opcion: \n1) Desimal a Romano \n2) Romano a Desimal \n3) Salir");

    	int opcion = (sc.nextInt());
    	
    	if(opcion ==1){
    		 aRomano();
    	}
    	if(opcion == 2){
    		aDecimal();
    	}
    		else{
    	         System.exit(0);
    	}
    	
      }
    }