package colecciones;
import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {


		//creamos la lista
		
		LinkedList<String> personas=new LinkedList<String>();
		
		//añadimos elementos a la lista
		
		personas.add("Pepe");
		personas.add("ana");
		personas.add("pedro");
		personas.add("david");
		
		//agregar elementos a la lista en una posicion determinada (comienza en 0)
		
		personas.add(0, "maria");	
		
			/*
			 * agregar elementos a la lista en una posicion
			 * cuando no sabemos el numero de elementos
			 * utilizaremos un iterador 
			 */
			
			
			//creamos el iterador
			
			ListIterator<String> it =personas.listIterator();
			
			//avanzamos una posicion en el iterador comenzando en el 0.
			
			it.next();
			
			it.add("julian");
		
		
		
		//averiguamos el numero de elementos de la lista
		
		System.out.println(personas.size());
		
		//imprimimos los elementos en consola con un bucle for each
		
		for (String imprime : personas) {
			
			System.out.println(imprime);
			
		}
		
	
		
		



	}

}
