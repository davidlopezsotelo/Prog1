package programacion_generica;

public class UsoPareja {

	public static void main(String[] args) {
		 
		/*instanciamos la clase propia 
		 * indicando el tipo de dato que vamos 
		 * a utilizar
		 */
		
		Propia1<String> una=new Propia1<String>();
		
		/*
		 * Cambiamos el vaor del campo de clase
		 * utilizando el metodo setter
		 */

		una.setPrimero("David");
		
		//imprimimos el cambio
		
		System.out.println(una.getPrimero());
		
		//instanciamos la clase persona
		
		Persona pers1=new Persona("Ana");
		
		//creamos una segunda instancia de la clase generica
		
		Propia1<Persona> otra =new Propia1<Persona>();
		
		/*
		*cambiamos el valor del campo de clase
		*pero le pasamos un objeto de tipo
		*persona, que hemos instanciado con anterioridad
		*/
		
		otra.setPrimero(pers1);
		
		System.out.println(otra.getPrimero());
		
		
	}

}

//----------------------------------------------------------------------

class Persona{
	
	private String nombre;

	public Persona(String nombre) {
		
		this.nombre=nombre;
		
	}
	
	public String toString() {
		return nombre;
	}
}
