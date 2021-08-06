package arrays;

public class Array6_bidimensional {

	public static void main(String[] args) {
		 
		//declaramos el array de forma manual
		
		int[][]matrix= {
				{12,23,47,26,54},
				{1,-3,70,60,50},
				{2,20,4,-15,52},
				{0,-3,-7,126,88},
		};
		
		/*
		 * primer bucle for recorre vertical y segundo horizontal
		 */
		
		//recorremos con for each anidados
		
		for(int []fila:matrix) {
			
			System.out.println();//salto de linea en cambio de dimension
			
			for(int z:fila) {

				System.out.print("[" + z + "]" + " ");
			}
		}
		

	}

}
