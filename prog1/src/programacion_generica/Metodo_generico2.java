package programacion_generica;

import java.util.GregorianCalendar;



//https://www.youtube.com/watch?v=7Ip_N1fbOmQ&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=166

/*
 * metodo que nos devolvera
 * el menor de los elementos de cualquier tipo
 *  que le pasemos por parametro
 */

public class Metodo_generico2 {

	public static void main(String[] args) {


		/*
		 * Creamos un array de tipo string
		 */
		
		String nombres[]= {"jose","maria","pepe"};
		
		//comparamos!!!!!
		
		System.out.println(MisMatrices2.getMenor(nombres));
		
						/*
						 * por ejemplo en la clase empleado....
						 * si el array tiene mas de un elemento, daria un error
						 * porque los objetos de tipo empleado no implementan la interfaz comparable
						 * 
						 */
						
						/*Empleado listaempleados[]= 
							{ 
								new Empleado("ana",45,2500),
								new Empleado("pepe",35,2000),
								new Empleado("jose",55,2100),
								new Empleado("maria",40,2200),
								new Empleado("antonio",35,3500),	
						   };
						
						System.out.println(MisMatrices2.getMenor(listaempleados));*/
		
		
		/*
		 * ejemplo de comparacion de la clase gregorian calendar
		 */
		
		GregorianCalendar fechas[]= 
			{
					new GregorianCalendar(2015,07,12),
					new GregorianCalendar(2012,03,14),
					new GregorianCalendar(2019,10,16),
					new GregorianCalendar(2021,01,10),
				
		   };
		
	
		
		//comprobamos:
		
	         
		System.out.println(MisMatrices2.getMenor(fechas).getTime());//El metodo getTime es para convertir a date
		

	}
	
}
//----------------------------------------------------------------------------------------
class MisMatrices2{
	
	/*
	 * METODO GENERICO:
	 * devolvera el mismo tipo que le pasemos por parametro
	 */
	
		/*
		 * AL COMPARAR ELEMENTOS GENERICOS 
		 * DEVEMOS IMPLEMENTAR LAINTERFAZ COMPARABLE
		 * DENTRO DEL METODO !!!!!!!!!
		 */
	
	public static <T extends Comparable> T getMenor(T[]a) {
		
			/*
			 * no devuelve nada si el array esta vacio
			 */
		
		if(a==null || a.length==0) {
			return null;
		}
			
			/*
			 * definimos el elemento menor para que compare
			 */
		
		T elementoMenor=a[0];
		
		for(int i=1;i<a.length;i++) {
			/*
			 * comparamos los elementos del array
			 * para ver cual es el menor
			 */
		
		   if(elementoMenor.compareTo(a[i])>0) {//debemos implementar la interfaz Comparable
			
			   elementoMenor=a[i];	
			
		}
	
     }
		return elementoMenor;
		
	}
	
}
//-------------------------------------------------------------------

