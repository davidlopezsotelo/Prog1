package programacion_generica;

/*
 * Creacion de metodos genericos
 * 
 * pueden crearse en clases genericas o
 * en clases normales
 */

public class Metodo_generico {

	public static void main(String[] args) {
		
		/*
		 * Creamos un array de tipo string
		 */
		
		String nombres[]= {"jose","maria","pepe"};
		
		String elementos=MisMatrices.getElementos(nombres);

		System.out.println(elementos);
		
		/*
		 * creamos un array de tipo Empleados
		 */


		Empleado listaempleados[]= 
			{ 
				new Empleado("ana",45,2500),
				new Empleado("ana",45,2500),
				new Empleado("ana",45,2500),
				new Empleado("ana",45,2500),
				new Empleado("ana",45,2500),	
		   };
		
		System.out.println(MisMatrices.getElementos(listaempleados));
	}

}

//----------------------------------------------------------------------------

/*
 * clase que nos dira la longitud de un array (de cualquir tipo)
 * que le pasemos por parametro
 */

class MisMatrices{
	
	/*
	 * METODO GENERICO:
	 */
	
	public static <T> String getElementos(T[]a) {
		
		return "El array tiene "+a.length+ " elementos.";
		
		
	}
	
}


//clase Empleado-----------------------------------------

 class Empleado{
	
	private String nombre;
	private int edad;
	private double salario;

	public Empleado(String nombre,int edad,double salario) {//constructor
		
		this.nombre=nombre;
		
		this.edad=edad;
		
		this.salario=salario;
	}
	
	public String dameDatos() {//getter
		
		return "El empleado se llama "+nombre+". Tiene "+edad+" años. Y un salario de "+salario;
		
	}
	
}

