package condicionales;
import java.util.*;
import javax.swing.*;

public class Calculo_areas_swich1 {
	
	/*
	 * programa para calcular el area dediferentes objetos
	 * usando el condicional swich
	 */

	public static void main(String[] args) {
		
		//pedimos opciones al usuario:
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1:Cuadrado \n2:Rectangulo \n3:Triangulo \n4:Circulo");
		
		//almacenamos el numero introduccio en una variable
		
		int figura=entrada.nextInt();
		
		/*
		 * tenemos que castear de forma manual los string que introduce el usuario
		 * mediante en metodo integer para convertir un string en un int
		 */
		
		//evaluamos la variable figura:
		
		switch(figura) {
		
			case 1:		//cuadrado 
				
				int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud del lado"));
			
				System.out.println("El area del cuadrado es: "+Math.pow(lado, 2));
				
				break;//debemos romper la ejecucion del programa
				
			case 2:    //Rectangulo
				
				int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud de la base"));
			
				int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud de la altura"));
				
				System.out.println("El area del Rectangulo es: "+base*altura);
				
				break;
				
			case 3:		//Triangulo  (reutilizamos las variables)
				
				 base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud de la base"));
				
				 altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud de la altura"));
				
				System.out.println("El area del Triangulo es: "+(base*altura)/2);
				
				break;								
				
			case 4:		//Circulo : area= pi*r^2 longitud de una circunferencia
				
				int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del radio"));
				
				/*
				 * esta ved imprimimos de forma distinta
				 * por un lado el mensaje, y por otro el resultado
				 * con printf, para darle forma y que no imprima un numero muy largo
				 */
				System.out.print("El area del circulo es: " );
				
				//le decimos mediante el primer parametro , que nos imprima dos decimales
				
				System.out.printf("%1.2f\n", Math.PI*(Math.pow(radio, 2)));
				
				System.out.println("La longitud de la circunferencia es: ");
				
				System.out.printf("%1.2f",2*Math.PI*radio);
				
				break;
				
				//podemos poner un default para el resto de opciones que no sean correctas
		
			default:
				
				System.out.println("La opcion seleccionada no es correcta.");
				
		}
		
		


		
		
	}

}
