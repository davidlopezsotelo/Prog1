package condicionales;

import java.util.*;


public class Evalua_edad_if1 {

	public static void main(String[] args) {

	/*
	 * creamos un objeto de tipo Scanner
	 * para pedir al usuario los datos
	 */
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("introduce tu edad. ");
		
		/*
		 * creamos una variable edad, donde almacenaremos
		 * el valor de la variable scanner "entrada"
		 */
		
		int edad=entrada.nextInt();
		
		/*
		 * evaluamos la edad que introduce el usuario-------------------------
		 */
		
		if(edad>=18) {
			
			System.out.println("tu edad es: "+edad);
			
			System.out.println("Eres mayor de edad, puedes acceder.");
		}else {
			System.out.println("Lo siento, no puedes acceder porque eres menor de edad");
		}
		
		
	}

}
