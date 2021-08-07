package arrayList;
import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		
							//Array clasico
		 
						/*Empleado listaEmpleados[]=new Empleado[3];
						
						listaEmpleados[0]=new Empleado("Ana",45,2500);
						
						listaEmpleados[1]=new Empleado("Antonio",55,2000);
						
						listaEmpleados[2]=new Empleado("Maria",25,1500);*/
		
		
		/*
		 * creamos un array list, de tipo Empleados
		 * con 10 elementos, autoampliables (por defecto)
		 */
		
		ArrayList <Empleado> listaEmpleados=new ArrayList<Empleado>();
		
								/*
								 * si queremos darle un numero de elementos iniciales distintos de 10:
								 * que tambien seran autoampliables
								 */	
					              listaEmpleados.ensureCapacity(12);
					              
		
		//rellenamos el arraylist

		listaEmpleados.add(new Empleado("Ana",45,2500));
		
		listaEmpleados.add(new Empleado("Antonio",55,2000));
		
		listaEmpleados.add(new Empleado("Maria",25,1500));
		
		listaEmpleados.add(new Empleado("Pepe",26,1500));
		
		
		/*
		 * para añadir un elemento en una posicion en concreto
		 * si ya esta ocupada,la sobreescribe
		 */
		
		listaEmpleados.set(1, new Empleado("Olga",29,1600));
		
		
		/*
		 * para imprimir una posicion en condreto del ArrayList
		 * si no ponemos el getter, nos dara la clave del objeto
		 * 
		 */
		
		System.out.println(listaEmpleados.get(3).dameDatos());
		
		
		
		
								System.out.println(listaEmpleados.size());// nos dice cuantos elementos tiene el ArayList
		
								/*
								 * si no queremos añadir mas elementos
								 * podemos cerrar el Arraylist, para optimizar 
								 * la memoria con el siguiente metodo
								 * pero podemos añadir mas elemetos
								 */
								
								listaEmpleados.trimToSize();	
								
		
		//bucle que imprime el array
		
		for(Empleado e:listaEmpleados) {
			
			System.out.println(e.dameDatos());
		}
		   System.out.println("");
		
		/*
		 * copiar el ArrayList en un array normal
		 */
		
		Empleado arrayEmpleados[]=new Empleado[listaEmpleados.size()];
		
		listaEmpleados.toArray(arrayEmpleados);
		
		//recorremos el array
		
		for(int i=0;i<arrayEmpleados.length;i++) {
			
			System.out.println(arrayEmpleados[i].dameDatos());
		}

	}

}
//CREAMOS LA CLASE EMPLEADOS-------------------------------------------------------------------------------

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
