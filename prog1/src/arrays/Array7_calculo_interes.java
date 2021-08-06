package arrays;


/*
 * Programa que calcula el interes anual de una cantidad fija
 */


public class Array7_calculo_interes {

	public static void main(String[] args) {
		 
		//declaramos variables
		
		double acumulado;
		double interes =0.10; //interes del 10%
		
		//declaramos el array:
		
		double[][]saldo =new double [6][5];
		
		//rellenamos el array con el saldo inicial en la primera posicion
		
		for(int i=0;i<6;i++) {
			
			saldo[i][0]=10000;
			acumulado=10000;
			
		//declaramos el segundo for:
			
			for(int j=1;j<5;j++) {
				
				//hacemos los calculos de los intereses
				
				acumulado=acumulado+(acumulado*interes);
				
				//introducimos el calculo en la casilla correspondiente(primera columna)
				
				saldo[i][j]=acumulado;
			}
			
			//incrementamos el interes en un 10%:
			
			interes=interes+0.01;
			
			
		}
		   int n=9;
		//recorremos la matriz para leerla
		
		for(int z=0;z<6;z++) {
			
			System.out.println();
				
			
				n++;
				System.out.print("Saldo inicial al "+n+" % :");
				
				
				
			
			for(int k=0;k<5;k++) {
			
				
				System.out.printf("%1.2f",saldo[z][k]);
				
				System.out.print(" ");
				
				
			}
		}

	}

}
