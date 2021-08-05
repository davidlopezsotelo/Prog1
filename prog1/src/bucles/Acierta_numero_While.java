package bucles;
import java.util.*;

public class Acierta_numero_While {

	public static void main(String[] args) {

		//generar un numero aleatorio entero entre el 1 y el 100:
		/*
		 * la clase random genera un numero double aleatorio entre 0 y 1
		 * tendremos que modificarla para que genere un numero
		 * aleatorio entre el 1 y el 100
		 */
		
		int aleatorio=(int)(Math.random()*100);
		
		/*
		 * pedimos al usuario que introduzca un numero
		 */
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos =0;
		
		//evaluamos
		
		while(numero!=aleatorio) {
			
			System.out.println("Introduce un numero");
			
			numero=entrada.nextInt();
			
			//si el numero es menor:
			
			if(aleatorio<numero) {
				
				System.out.println("Mas bajo...");
			}
			//si el numero es mayor:
			
			else if(aleatorio>numero) {
				System.out.println("Mas alto...");
			}else {
				System.out.println("acertaste!!");
			}
			
			intentos++;
			
		}
		System.out.println("Numero de intentos= "+intentos);
		
		
	}

}
