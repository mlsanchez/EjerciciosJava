package NumRomanos;

import java.util.Scanner;

public class ConvertidorNum {
	public static String entrada() {
       
         Scanner sc = new Scanner( System.in );
   		String salida = (sc.next());
            return salida; 
    }
     public static int numero() {
       
       Scanner sc = new Scanner( System.in );
	   
	 int numero = (sc.nextInt());
            return numero; 
    }
    
    public static void aRomano(){
        
    	  Scanner sc=new Scanner(System.in);
	      
	      String Millar[]={"","M","MM","MMM"};
	      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	   
	      
          System.out.println("Ingresa numero entre 1 y 3888");
        
	     int decimal = sc.nextInt(), u=decimal%10, d=(decimal/10)%10, c=(decimal/100)%10,  m=decimal/1000;
	      if(decimal>=3889){ 
	    	  System.out.println("Fuera de Rango");
        }
	      else{
	   	     if(decimal>=1000 && decimal<=3888){ 
	    	  System.out.println(Millar[m]+Centena[c]+Decena[d]+Unidad[u]);
         }
	      else{
	          if(decimal>=100){         
	          System.out.println(Centena[c]+Decena[d]+Unidad[u]);
	      }else{
	          if(decimal>=10){
	           System.out.println(Decena[d]+Unidad[u]);          
	          }
	       else{
	           System.out.println(Unidad[decimal]);  
	       }
	      }
	     }
	   }
	 }
	   
    public static void aDecimal(){
    	
    	Scanner sc = new Scanner(System.in);
    	
        System.out.print("Ingrese el numero 'Romano': ");
        String romano = sc.nextLine();
           
        char Romano[]= {' ','I','V','X','L','C','D','M'}; 
        int decimal[] = {0,1,5,10,50,100,500,1000};
        int ant = 0, sum = 0;
        char letra = ' ';
        for(int i = 0; i < romano.length(); i++){
                letra = romano.charAt(i);
        for(int recorre = 0; recorre < Romano.length; recorre++){ 
        	if(letra == Romano[recorre]){
        		
        		sum = sum + decimal [recorre];
        		
        		
        		if( ant < decimal[recorre]){
        			sum = sum - ant*2 ;
        			ant = decimal[recorre]; 
                            }
        		      }
        	else {
                System.out.print("LETRA NO CORRESPONDE A ROMANOS  ");

        	}
                }
        }
        System.out.print(sum);    
    }
 }
   
