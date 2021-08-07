package colecciones;

import java.util.*;


/*
 * 
 *------------------------------- SET.--------------------------------------------
 *   
 *   
 */

//https://www.youtube.com/watch?v=rqHBXAZ9F9k&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=180

public class CuentasUsuarios {

	public static void main(String[] args) {
		
		/*
		 * creamos los clientes instanciando la clase cliente
		 * del mismo paquete
		 */
		
							      //nombre,  num cuenta,  saldo
		
		Cliente cl1=new Cliente("Juan lopez","00001", 20000.00);

		Cliente cl2=new Cliente("Francisco pez","00002", 1800.00);

		Cliente cl3=new Cliente("Ana Garcia","00003", 2001.50);

		Cliente cl4=new Cliente("Pedro Martin","00004", 1598.90);

		Cliente cl5=new Cliente("David Lopez","00005", 250000.30);

		Cliente cl6=new Cliente("David Lopez","00005", 250000.30);

		//creamos la coleccion
		
					/*
					 * debemos instanciar la interfaz de la clase
					 * despues del operador new
					 */

		Set<Cliente> clientes_banco=new HashSet<Cliente>();
		
				//agregamos los clientes a la lista
		
		clientes_banco.add(cl1);
		clientes_banco.add(cl2);
		clientes_banco.add(cl3);
		clientes_banco.add(cl4);
		clientes_banco.add(cl5);
		clientes_banco.add(cl6);
		
					/*
					 * elementos duplicados.
					 * 
					 * el metodo equals no funciona con clases propias
					 * devemos darle algo de referencia
					 */
					
			if(cl5.equals(cl6))	{	
					System.out.println("La cuenta esta duplicada\n");
			  }
			else {
				System.out.println("NO son la misma cuenta\n");
			}//podemos comprobar el funcionamiento cambiando el numero de cuenta
		
					
			
		//recorremos la coleccion con un bucle for each:   (fore+Ctrl+espacio)
		
			System.out.println("LISTA DE CLIENTES DEL BANCO\n");
			
		for (Cliente cliente : clientes_banco) {
			
			
			
			System.out.println(cliente.getNombre() + " "
			 + cliente.getN_cuenta()+" "+cliente.getSaldo());
			

		}

	}
}

/*
 * Metodo HashCode:
 * es un codigo que hace referencia a un objeto almacenado
 * en la memoria Heap
 */
