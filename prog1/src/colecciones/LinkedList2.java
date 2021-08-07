package colecciones;
import java.util.*;

public class LinkedList2 {

	public static void main(String[] args) {

		//creamos la primera lista
		
		LinkedList<String> paises=new LinkedList<String>();
		
		//añadimos los elementos
		
		paises.add("España");
		paises.add("Francia");
		paises.add("Portugal");
		paises.add("Italia");
		
		
		//creamos la  segunda lista.
		
		LinkedList<String> capitales=new LinkedList<String>();
		
		//añadimos los elementos
		
		capitales.add("Madrid");
		capitales.add("Paris");
		capitales.add("Lisboa");
		capitales.add("Roma");
		
		
		
		System.out.println(paises);
		System.out.println(capitales);
		
		/*
		 * agregamos los elementos de la segunda lista
		 * a la primera
		 * usando un list iterator
		 */
		
		//creamos los iteradores
		
		ListIterator<String> iterA=paises.listIterator();
		
		ListIterator<String> iterB=capitales.listIterator();
		
		
		/*
		 * mirar detenidamente el siguiente codigo!!!!!!!!!!!!!
		 */
		
		while(iterB.hasNext()) { // mientras en la primera lista haya un elemenyto
			
			if(iterA.hasNext()) {//si hay elementos en la segunda lista
				
				//el iterador saltara una posicion
				
				iterA.next();
	
			}//y agregar en la primera vuelta del bucle, el elemento de la lista B en la lista A
			
			iterA.add(iterB.next());
		}

		
		
		System.out.println(paises);
		System.out.println(capitales);
		
		
		
		
		/*
		 * eliminar las posiciones pares de la lista de capitales
		 */
		
		//ahora el iterador se encuentra en la ultima posicion,hay que regresarlo al pricipio(reiniciandolo)
		
		iterB=capitales.listIterator();
		
		while(iterB.hasNext()) {//mientras tenga elementos...
			
			iterB.next(); // saltamos una posicion (empezando por la 1)
			
			if(iterB.hasNext()) {//vuelve a saltar si hay otra posicion y eliminalo (2)
				
				iterB.next();//salta
				
				iterB.remove();//elimina (2)
			}
		}
		
		System.out.println(paises);
		System.out.println(capitales);
		
		/*
		 * eliminamos las capitales de la lista paises
		 * eliminado una colecion de una lista
		 * 
		 * solo eliminara las 	que esten tambien en la lista de capitales
		 */
		
		paises.removeAll(capitales);	
		
		
		System.out.println(paises);
		System.out.println(capitales);
		
	}

}
