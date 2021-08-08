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
		 * array de tipo empleados
		 */

		Empleado[]misEmpleados=new Empleado[4];
		
		misEmpleados[0]=new Empleado("Ana", 3000.00, 2000, 07, 07);
		misEmpleados[1]=new Empleado("Carlos", 4000.00, 1995, 03, 17);
		misEmpleados[2]=new Empleado("paco", 2100.00, 2005, 02, 01);
		misEmpleados[3]=new Empleado("antonio", 1900.00, 2000, 9, 27);
		
		
		for (Empleado e : misEmpleados) {
			
			e.subeSueldo(5);
			System.out.println();
		}
		
		/*Empleado empleado1=new Empleado("Paco gomez", 2500.00,1990,12,17);
		Empleado empleado2=new Empleado("ana lopez", 1985.50,1999,06,02);
		Empleado empleado3=new Empleado("David lopez", 4500.00,2020,1,15);*/
		
		/*
		 * usamos el metodo de la clase que hemos creado
		 */
		/*empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(10);*/
		
		//imprimimos
		
		/*System.out.println("Nombre: "+empleado1.getNombre()+ " ||Sueldo: "+empleado1.getSueldo()
		+ " ||Fecha de alta: "+empleado1.getFechaContrato());
		
		System.out.println("Nombre: "+empleado2.getNombre()+ " ||Sueldo: "+empleado2.getSueldo()
		+ " ||Fecha de alta: "+empleado2.getFechaContrato());
		
		System.out.println("Nombre: "+empleado3.getNombre()+ " ||Sueldo: "+empleado3.getSueldo()
		+ " ||Fecha de alta: "+empleado3.getFechaContrato());*/
		
		
		
		
		
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
	
	//constructor______________________
	
	public Empleado(String nom, double sue, int agno ,int mes,int dia) {
		
		nombre=nom;
		sueldo=sue;
		
		//la clase gregorian calendar, se usa para construir una fecha usando parametros
		
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);	//los meses empiezan por enero=0
		
		//construimos la fecha
		
		altaContrato=calendario.getTime();
		
	}
	
     //Getters__________________________
	
	public String getNombre() {
		return nombre;
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
 * creamos clase que hereda de empleado------------------------------------------
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
	
	public double getSueldo() {
		
		double sueldoJefe=super.getSueldo();//usamos el geter de la clase padre para que me devuelva el sueldo
		
		return sueldoJefe+incentivo;
		
	}
	
	
	private double incentivo;
	
	
	
	
	
	
	
}


