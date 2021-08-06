package arrays;

import javax.swing.JOptionPane;

public class Array3_forEach2 {

	public static void main(String[] args) {
		
		//creamos la matriz
		
		String[]paises=new String[8];
		
		
		//rellenar matriz por usuario
		
				for(int i=0;i<8;i++) {
					
					paises[i]=JOptionPane.showInputDialog("Introduce pais: ");
				}
				
		//recorremos matriz
				
				for(String elemento:paises) {
					
					System.out.println("Pais: "+elemento);
				}
				
				

	}

}
