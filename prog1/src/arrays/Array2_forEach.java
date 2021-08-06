package arrays;

import javax.swing.JOptionPane;

public class Array2_forEach {

	public static void main(String[] args) {
		
		//creamos el array
		
		String []paises=new String[8];
		
		paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";
		
		//recorremos el array con for:
		for(int i=0;i<paises.length;i++) {
			
			System.out.println("Pais "+(i+1)+" "+paises[i]);
		}
		
		//recorremos el array con for each:
		
		for(String elemnto:paises) {
			
			
			System.out.println("Pais: "+elemnto);
			
			
		}
		
		//rellenar matriz por usuario
		
		for(int i=0;i<8;i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce pais: ");
		}

	}

}
