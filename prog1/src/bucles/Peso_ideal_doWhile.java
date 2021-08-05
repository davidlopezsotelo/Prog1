package bucles;
import javax.swing.*;

public class Peso_ideal_doWhile {
	
	/*
	 * Programa para calcular el peso ideal de una persona segun su sexo
	 */

	public static void main(String[] args) {


		String genero="";
		
		//evaluamos--------------------------------------------
		
		/*
		 * pedimos el genero por consola y evaluamos, se repetira el bucle
		 * mientras sea diferente de H y difirente de M, ignorando el case(mayuscula o minuscula)
		 * para que la condicion del while sea cierta, deben cumplirse las dos 
		 * condiciones
		 */
		
		do {
			
			genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		/*
		 * pedimos la altura al usuario--------------------------------
		 * combertimos el string en un int.
		 */
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm."));
		
		/*
		 * calculamos el peso ideal segun los datos(formula de Wan der vael)
    	 */
		
		double pesoideal=0;
		
		if(genero.equalsIgnoreCase("H")) {
			
			pesoideal=(altura-150)*0.75+50;
			
		}
		else if (genero.equalsIgnoreCase("M")) {
			
			pesoideal=(altura-150)*0.6+50;
		}
		
		System.out.println("Tu peso ideal es "+pesoideal);
		
		
	}

}
