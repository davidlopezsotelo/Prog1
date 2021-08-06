package arrays;

public class array4_rellenoAutomatico {

	public static void main(String[] args) {

		//declaramos el array
		
		int[]aleatorios=new int[150];
		
		//rellenamos el array con numeros aleatorios
		
		for(int i=0;i<aleatorios.length;i++) {
			
			//refundimos a int, redondeamos, aleatorios entre 0 y 99
			
			aleatorios[i]=(int)Math.round(Math.random()*100);
		}
		
		//recorremos el array
		
		for(int numeros:aleatorios) {
			
			System.out.print(numeros+" ");
		}
		
		
	}

}
