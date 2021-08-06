package arrays;

public class array5_bidimensionales {

	public static void main(String[] args) {
         
		//declaramos array: [Vertical,columnas][Horizontal,filas]
		
		int[][] matrix=new int[4][5];
		
		//rellenamos la matriz de forma manual:
		
		matrix [0][0]=0;
		matrix [0][1]=12;
		matrix [0][2]=44;
		matrix [0][3]=21;
		matrix [0][4]=7;
		
		matrix [1][0]=1;
		matrix [1][1]=10;
		matrix [1][2]=20;
		matrix [1][3]=30;
		matrix [1][4]=40;
		
		matrix [2][0]=2;
		matrix [2][1]=12;
		matrix [2][2]=30;
		matrix [2][3]=47;
		matrix [2][4]=100;
		
		matrix [3][0]=3;
		matrix [3][1]=-8;
		matrix [3][2]=-65;
		matrix [3][3]=-22;
		matrix [3][4]=-999;
		
		/*
		 * primer bucle for recorre vertical y segundo horizontal
		 */
		
		//recorremos con for anidados
		
		for(int i=0;i<4;i++) {
			
			System.out.println();//salto de linea en cambio de dimension
			
			for(int j=0;j<5;j++) {
				
	
				System.out.print("[" + matrix[i][j] + "]" + " ");
			}
		}
		
	}

}
