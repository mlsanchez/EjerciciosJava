package NumRomanos;

import java.util.Scanner;

public class ConvertidorNum {
	public static void main(String... args) {
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

}
