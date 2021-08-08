package colecciones;
import java.util.*;

public class Mapas1 {

	public static void main(String[] args) {

		/*
		 * construimos un mapa, que crea una relacion
		 * de clave/valor
		 */
		
		HashMap<String, Empleado> personal=new HashMap<String,Empleado>();
		
		/*
		 * introducimos objetos de tipo empleado
		 * dentro del mapa ,utilizando el metodo put.
		 */

		personal.put("001", new Empleado("David Lopez"));
		personal.put("002", new Empleado("Ana Perez"));
		personal.put("003", new Empleado("Sonia Sanchez"));
		personal.put("004", new Empleado("Jose Lopez"));
		
		//imprimimos collecion
		
		System.out.println(personal);
		
		
		//borrar entrada
		
		personal.remove("003");
		
		System.out.println("\n borramos un elemento:\n");
		
		System.out.println(personal);
		
		
		//sutituimos un elemento,reintroduciendo un elemeno con la misma clave
		
		personal.put("004", new Empleado("Natalia"));
		
		System.out.println("\n Reemplazamos un elelmento:\n");
		
		System.out.println(personal);
		
		System.out.println(" ");
		
		
		//Devuelve una coleccion de tipo set
		
		System.out.println(personal.entrySet());
		
		
		
		//recorremos con foreach para que nos lo devuelva como un set,en vertical
		
		System.out.println("\nOrdenado de forma manual.\n");
		
		for (Map.Entry<String, Empleado> entrada:personal.entrySet()) {
			
			String clave=entrada.getKey();
			
			Empleado valor=entrada.getValue();
			
			System.out.println("Clave= "+clave+" Valor= "+valor);
			
		}
		
		
		
		
	}

}

//CLASE QUE CONSTRUYE OBJETOS EMPLEADO--------------------------------------------

class Empleado{
	
	//variables
	
	private String nombre;
	private double sueldo;
	
	//constructor
	
	public Empleado(String n) {
		
		 nombre = n;
		
		 sueldo = 2000;
	}
	
	//metodo toString
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	
	
	
	
}