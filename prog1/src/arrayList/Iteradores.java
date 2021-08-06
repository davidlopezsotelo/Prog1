package arrayList;

import java.util.*;

public class Iteradores {
	
	/*
	 * los iteradores son elementos que se utilizan
	 * para recorrer un array list
	 */

	public static void main(String[] args) {
		
		/*
		 * creamos y rellenamos el array list
		 */
        
		
		ArrayList <Empleado2> listaEmpleados=new ArrayList<Empleado2>();
		
		listaEmpleados.add(new Empleado2("Ana",45,2500));
		
		listaEmpleados.add(new Empleado2("Antonio",55,2000));
		
		listaEmpleados.add(new Empleado2("Maria",25,1500));
		
		listaEmpleados.add(new Empleado2("Pepe",26,1500));
		
		/*
		 * creamos el iterador para que nos imprima
		 * los elementos del array list
		 */
		
		Iterator <Empleado2> mi_iterador=listaEmpleados.iterator();
		
		System.out.println("iterador.");
			
		
		while(mi_iterador.hasNext()) {
			
			
			System.out.println(mi_iterador.next().dameDatos());
		}
		
		
	}

}
//CREAMOS LA CLASE EMPLEADOS-------------------------------------------------------------------------------

class Empleado2{
	
	private String nombre;
	private int edad;
	private double salario;

	public Empleado2(String nombre,int edad,double salario) {//constructor
		
		this.nombre=nombre;
		
		this.edad=edad;
		
		this.salario=salario;
	}
	
	public String dameDatos() {//getter
		
		return "El empleado se llama "+nombre+". Tiene "+edad+" años. Y un salario de "+salario;
		
	}
	
}
