package colecciones;
import java.util.*;

/*
 * TREESET
 * ordena los elementos de la lista,ya que implementa
 * la interfaz comparable, por defecto, para String
 */


public class TreeSet1 {

	public static void main(String[] args) {
		
		//creamos la lista
		
		System.out.println("Orden alfabetico:-------------------------------\n");
		
		TreeSet<String> ordenaPersona=new TreeSet<String>();
		
		//añadimos los elementos
		
		ordenaPersona.add("Sandra");
		ordenaPersona.add("Amaia");
		ordenaPersona.add("Diana");
		
		/*
		 * recorremos con un bucle foreach
		 */
		
		for (String s : ordenaPersona) {
			
			System.out.println(s);
			
		}
		
		System.out.println("");
		System.out.println("Orden por numero:---------------------------------\n");
		
		/*
		 * creamos un treeset para la clase articulo
		 */
		
		TreeSet<Articulo> ordenaArticulos =new TreeSet <Articulo>();
		
		Articulo tercero=new Articulo(3,"tercer articulo");
		Articulo segundo=new Articulo(2,"segundo articulo");
		Articulo primero=new Articulo(1,"primer articulo");
		Articulo quinto=new Articulo(5,"quinto articulo");
		Articulo cuarto=new Articulo(4,"cuarto articulo");
		
		ordenaArticulos.add(segundo);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(cuarto);
		
		for (Articulo articulo : ordenaArticulos) {
			
			System.out.println(articulo.getDescripcion());
		}
		
		/*
		 * creamos un objeto de tipo comparador, para la clase Articulo
		 */
		
		Articulo comparadorArticulos=new Articulo();
		
		System.out.println(" ");
		System.out.println("Orden alfabetico:---------------------------\n");
		/*
		 * creamos el TreeSet,pasandole
		 * por parametro el objeto comparador
		 */
		
		TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(comparadorArticulos);
		
		//agregamoslos articulos
		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		ordenaArticulos2.add(cuarto);
		
		//recorremos e imprimimos
		
		for (Articulo articulo : ordenaArticulos2) {
			System.out.println(articulo.getDescripcion());
		}
		
		/*
		 * creamos un objeto de tipo comparador
		 * para la clase ComparadorArticulos
		 */
		
		ComparadorArticulos compara_art =new ComparadorArticulos();
		
		//creamos el TreeSet
		
		System.out.println();
		System.out.println("Orden alfabetico:------------------------------------");
		
		TreeSet<Articulo> ordenaArticulos3=new TreeSet<Articulo>(compara_art);
		
		ordenaArticulos3.add(primero);
		ordenaArticulos3.add(quinto);
		ordenaArticulos3.add(segundo);
		ordenaArticulos3.add(tercero);
		ordenaArticulos3.add(cuarto);
		
		for (Articulo articulo : ordenaArticulos3) {
			
			System.out.println(articulo.getDescripcion());
		}
		
		
	}

	
}
//clase que crea objetos de tipo articulo--------------------------------------
	
		/*
		 * devemos implementar la interfaz comparable
		 * para clases que creamos nosotros
		 * 
		 * y comparator para hacer otro tipo de comparacion
		 */

	class Articulo implements Comparable<Articulo>, Comparator<Articulo>{
		
		private int numero_articulo;
		
		private String descripcion;
		
		//creamos constructor por defecto
		
		public Articulo(){
			
		}
		
		//creamos el constructor
		
		public Articulo(int num,String desc) {
			
			 numero_articulo = num;
			
			 descripcion = desc;
			
		}
		
		//getter 
		
		public String getDescripcion() {
			return descripcion;
		}



		//metodo compare to (solo podemos crear uno por cada clase)

	@Override
	public int compareTo(Articulo o) {
		
		/*
		 * ordenamos los elementos en funcion 
		 * del numero de articulo
		 */

		return numero_articulo - o.numero_articulo;
	}

	
	
	/*
	 * si queremos hacer mas de una comparacion dentro de la misma clase,
	 * devemos hacerlo con la interfaz comparator
	 * 
	 * sobreescribiendo el metodo compare
	 */
	
		@Override
		public int compare(Articulo o1, Articulo o2) {
			
			//creamos dos variables para guardar las descripciones introducidas en el metodo, por parametros
			
			String descripcionA=o1.getDescripcion();
			
			String descripcionB=o2.getDescripcion();
			
			
			//devuelve la comparacion de los dos objetos.
			
			
			return descripcionA.compareTo(descripcionB);
		}
	
	
	
}
	
//CLASE COMPARADOR ARTICULOS----------------------------------------------------
		
	class ComparadorArticulos implements Comparator<Articulo>{

		
    //metodo compare

	public int compare(Articulo o1, Articulo o2) {
			
			//creamos dos variables para guardar las descripciones introducidas en el metodo, por parametros
			
			String descripcionA=o1.getDescripcion();
			
			String descripcionB=o2.getDescripcion();
			
			
			//devuelve la comparacion de los dos objetos.
			
			
			return descripcionA.compareTo(descripcionB);
		}
		
	}
	