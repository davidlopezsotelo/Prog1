package bucles;
import javax.swing.*;
public class Acceso_while {
	
	/*
	 * Programa que nos da acceso a una aplicacion
	 * mediante una contrase�a
	 */

	public static void main(String[] args) {
		
		//declaramos las variables de acceso al programa

		String clave="david";	
		String pass="";
		
		/*
		 * el bucle while evalua la condicion mientras sea cierta en este caso
		 * el while se ejecuta mientras la clave no sea igual al pass
		 */
		
		while(clave.equals(pass)==false) {
			
			/*
			 * se pide la contrase�a al usuario
			 */
			
			pass=JOptionPane.showInputDialog("Introduce la contrase�a");
			
			if(clave.equals(pass)==false) {
				
				System.out.println("contrase�a incorrecta");
			}
			
		}
		
		System.out.println("contrase�a correcta!!");
		
		
		
	}
	//doWhile:
	//https://www.youtube.com/watch?v=gzJn5MTSL5U&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=20

}
