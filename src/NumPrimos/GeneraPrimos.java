package NumPrimos;
/**
 * Maria Lucero Sanchez Rodriguez 
 * 
 * El programa bajo de tiempo de  27,704seg a 14 seg**/
public class GeneraPrimos {
	public static void main (String... arg ){

		Integer cont=2, cantidad = 0;
		long inicio, fin;
		boolean primo;

		inicio = System.currentTimeMillis();
		while (cantidad < 10001){
			primo = true;
			for (int i=2;i<=cont/2;i++){
				if(cont%i==0)
				primo = false;
		}
			if (primo ==true){
				cantidad ++;
				System.out.println(cont);

			if(cantidad == 10001){
				fin = System.currentTimeMillis()-inicio;
				System.out.println("Ejecucion en"+ (fin/1000) +" Segundos");
				}
			}
			cont ++;

		}

	}

}
