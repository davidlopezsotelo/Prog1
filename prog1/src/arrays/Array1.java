package arrays;

public class Array1 {

	public static void main(String[] args) {

		//declaramos un array de 5 elementos
		
		//forma 1
		
		int [] matriz1=new int[5];
		
		//rellenamos el array de forma manual:
		
		matriz1[0]=5;		
		matriz1[1]=35;		
		matriz1[2]=-15;		
		matriz1[3]=92;		
		matriz1[4]=51;
		
		System.out.println("matriz 1: ");
		
		//recorremos un array:
		
		for(int i=0;i<matriz1.length;i++) {
			
			/*
			 * a cada vuelta del bucle for, imprimira el valor que tenga i 
			 */
			
			System.out.println("valor del indice "+i+" = "+matriz1[i]);
		}

		
	
	//forma 2
	
	int []matriz2= {5,47,-63,55,12};
	
	System.out.println("matriz 2: ");
	
	for(int i=0;i<matriz2.length;i++) {
		
		/*
		 * a cada vuelta del bucle for, imprimira el valor que tenga i 
		 */
		
		System.out.println("valor del indice "+i+" = "+matriz2[i]);
	}
	}//cambios en git

}
