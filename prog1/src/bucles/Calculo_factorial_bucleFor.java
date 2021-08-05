package bucles;
import javax.swing.*;

public class Calculo_factorial_bucleFor {
	
	/*
	 * Programa que calcula el factorial de un numero entero
	 */

	public static void main(String[] args) {
		
		//declaramos las variables
		
		Long resultado=1L;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		
		//recorremos------------
		
		if(numero<21) {
	
		for(int i=numero;i>0;i--) {
			
			resultado=resultado*i;
		}
		
		System.out.println("El factorial del numero "+numero+" es "+resultado);
		}else System.out.println("El resultado es demasiado grande!!!");
		
		
		
	}

}
