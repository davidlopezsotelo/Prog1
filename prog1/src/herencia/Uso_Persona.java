package herencia;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {

		
		Persona[]lasPersonas=new Persona[2];//array
		
		lasPersonas[0]=new Empleado2 ("Pablo pineda",5000,2009,02,25);//creacion de instancias
		
		lasPersonas[1]=new Alumno("Iker Castro","Fisica");
		
		//recorremos el array
		
		for (Persona p : lasPersonas) {
			
			System.out.println(p.getNombre()+" ;"+p.getDescripcion()+"\n");
			
		}

	}

}
 //CLASE PADRE PERSONA (ABSTRACTA)--------------------------------------------------------

abstract class Persona{
	
	String nombre;
	
	public Persona(String nom) {
		
		nombre=nom;
		
	}
	
	//getter
	
	public String getNombre() {
		return nombre;
	}
	
	/*
	 * creacion del metodo Abstracto, que deben de tener todas las clases
	 * que hereden de persona, pero que debe ser distinto para
	 * cada clase.
	 * se debe de sobreescribir de forma obligatoria.
	 */
	
	public abstract String getDescripcion();
	
}


//CLASE EMPLEADO2------------------------------------------------------------

/*
* 
*/

class Empleado2 extends Persona{
	
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
	//constructor______________________
	
	public Empleado2(String nom, double sue, int agno ,int mes,int dia) {
		

		super(nom);//llamamos al constructor de la clase padre, si no dara error
		
		sueldo=sue;
		
		//la clase gregorian calendar, se usa para construir una fecha usando parametros
		
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);	//los meses empiezan por enero=0
		
		//construimos la fecha
		
		altaContrato=calendario.getTime();
		
		//le proporcionamos un campo Id, que se genera alearoriamente
		
		++IdSiguiente;
		
		Id=IdSiguiente;
	}
	
   //Getters__________________________
	

	public double getSueldo() {
		return sueldo;
	}
	
	public Date getFechaContrato() {
		return altaContrato;
	}
	
	/*
	 * metodo que sube el sueldo
	 * usando unm setter
	 */
	
	//setter___________________________
	
	public void subeSueldo(double porcentaje) {   //porcentaje:parametro que le damos para calcular el porcentaje de subida
		
		double aumento=sueldo*porcentaje/100;     //aumento: variable que muiltiplica el porcentaje de aumento del sueldo
		
		sueldo+=aumento;                          //al sueldo le sumas el aumento		
	}

	/*
	 * metodo abstracto----------------------------------------------
	 */
	@Override
	public String getDescripcion() {
		
		
		return "Este empleado tiene un id= "+Id+" Con un sueldo= "+sueldo;
	}
}
//CREACION DE LA CLASE ALUMNO------------------------------------------------------------------------------------------------

class Alumno extends Persona{
	
	private String carrera;

	public Alumno(String nom, String car) {
		super(nom);
		
		carrera=car;
		

	}

	@Override
	public String getDescripcion() {

		return "Este alumno esta estudiando la carrera de "+carrera;
	}
	
}






