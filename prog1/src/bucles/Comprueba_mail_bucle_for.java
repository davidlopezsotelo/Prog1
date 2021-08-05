package bucles;

import javax.swing.JOptionPane;

public class Comprueba_mail_bucle_for {
	
	/*
	 * programa que verifica si un email es correcto
	 */

	public static void main(String[] args) {

		//declaramos las variables
		
		int arroba=0;
		
		boolean punto=false;
		
		String mail=JOptionPane.showInputDialog("Introduce Mail. ");
		
		//recorremos el mail para comprobar que tenga una arroba.
		
		for(int i=0;i<mail.length();i++) {
			
			//comprobamos si tiene arroba(solo deve tener 1)
			
			if(mail.charAt(i)=='@') {
				
				arroba++;	
			}
			
			//comprovamos si tiene punto
			
			if(mail.charAt(i)=='.') {
			
			punto=true;
		}
			
		}

		
		if(arroba==1 && punto==true) {
			System.out.println("El mail es correcto.");
		}
		else System.out.println("Mail incorrecto.");
		
	}

}
