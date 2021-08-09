package herencia;

import java.util.*;

/*
 * USANDO FECHAS!!--------------------------
 * 
 * https://www.youtube.com/watch?v=sdJgcMaazmI&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=43
 */

public class Uso_empleado {

	public static void main(String[] args) {
		
		/*
		 * Instanciamos la clase jefatura
		 */
		
		Jefatura jefe_RRHH =new Jefatura("David",5000,1990,5,12);
		
		//establecemos el incentivo
		
		jefe_RRHH.estableceIncentivo(1000);

		/*
		 * array de tipo empleados
		 */

		Empleado[]misEmpleados=new Empleado[6];
		
		misEmpleados[0]=new Empleado("Ana", 3000.00, 2000, 07, 07);
		misEmpleados[1]=new Empleado("Carlos", 4000.00, 1995, 03, 17);
		misEmpleados[2]=new Empleado("paco", 2100.00, 2005, 02, 01);
		misEmpleados[3]=new Empleado("antonio", 1900.00, 2000, 9, 27);
		
		misEmpleados[4]=jefe_RRHH;//polimorfismo, principio de sutitucion.
		
		misEmpleados[5]=new Jefatura("Marta",6000,1998,10,30);
		
		/*
		 * casting para utilizar los metodos de la clase hija
		 * en un array de la clase padre
		 * 
		 * convierte a tipo jefatura un objeto de tipo empleado(misEmpleados)
		 */
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		
		jefa_Finanzas.estableceIncentivo(5000);
		
		//subir el sueldo
		
		for (Empleado e : misEmpleados) {
			
			e.subeSueldo(5);
			
		}
		

		//imprimir array
		
		for (Empleado e : misEmpleados) {
			
			System.out.println("Nombre: "+e.getNombre()+ " Sueldo: "+e.getSueldo()
			   +" fecha de alta: "+e.getFechaContrato());
			System.out.println();
		}
		
		
		
	}

}
//CLASE EMPLEADO------------------------------------------------------------

/*
 * clase que crea los empleados con los datos
 * que le pasamos por parametro y con un metodo
 * para subir el sueldo
 */

class Empleado{
	
	private String nombre;	
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
	//constructor______________________
	
	public Empleado(String nom, double sue, int agno ,int mes,int dia) {
		
		nombre=nom;
		sueldo=sue;
		
		//la clase gregorian calendar, se usa para construir una fecha usando parametros
		
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);	//los meses empiezan por enero=0
		
		//construimos la fecha
		
		altaContrato=calendario.getTime();
		
		//le proporcionamos un campi Id, que se genera alearoriamente
		
		++IdSiguiente;
		
		Id=IdSiguiente;
	}
	
     //Getters__________________________
	
	public String getNombre() { // nos devuelve el nombre y el Id aleatorio
		return nombre + " Id: "+Id;
	}

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

}

/*
 * creamos clase JEFATURA  que hereda de empleado------------------------------------------
*/

class Jefatura extends Empleado{
	
	//constructor que llama al constructor de la case padre
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);//super hace referencia a los parametros de la superclase

			
	}
	//metodo setter que establece el incentivo
	
	public void estableceIncentivo(double b) {
		
		incentivo=b;//almacenamos en la variable incentivo, el valor que le pasemos al set, por parametro
		
	}
	
	/*
	 * sobreescribimos el getter de la clase padre
	 */
	
	public final double getSueldo() {// nota al final....
		
		double sueldoJefe=super.getSueldo();//usamos el geter de la clase padre para que me devuelva el sueldo
		
		return sueldoJefe+incentivo;
		
	}
	
	private double incentivo;
	
}

//GERARQUIA, creacion de la clase DIRECTOR, que hereda de la clase JEFATURA

//--------------------------------------------------------------------------------------------------

final class Director extends Jefatura{//final= no se puede heredar de esta clase

	public  Director(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);

	}	
}

/*
 * NOTA: el id se eltablece en el orden de introduccion 
 * en el programa de los objetos, mientras que el orden
 * de impresion es distinto.
 * 
 * final, se pude usar tanto en clases como en metodos, para
 * evitar que se herede de una clase o que
 * se sobreescriba un metodo de la superclase cuando
 * se hereda de esta.
 */


