package programacion_generica;

/*
 * convertir una clase normal en una 
 * clase generica propia
 */

public class Propia1 <T> {  // le indicamos que manejara argumento generico "T"

	//creamos un campo de clase generico
	
	private T primero;
	
	//creamos el constructor
	
	public Propia1() {
		
		primero=null;
	}
	
	//creamos un metodo setter para cambiar el valor del parametro "primero"
	
	public void setPrimero (T nuevoValor) {
		
		primero =nuevoValor;
		
	}
	
	//creamos el getter
	
	public T getPrimero() {
		
		return primero;
	}
	
	
	
}
