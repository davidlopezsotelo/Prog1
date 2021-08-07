package colecciones;

import java.util.Objects;

/*
 * Clase para crear los clientes de una
 * cuenta bancaria
 */

public class Cliente {
	
	//creamos los get y set--------------------
	
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getN_cuenta() {
			return n_cuenta;
		}
		public void setN_cuenta(String n_cuenta) {
			this.n_cuenta = n_cuenta;
		}
		public Double getSaldo() {
			return saldo;
		}
		public void setSaldo(Double saldo) {
			this.saldo = saldo;
	    }
			/*
			 * sobreescribimos el metodo equals para que pueda comparar
			 * objetos de una clase propia
			 * 
			 * se pueden sobreescribir automaticamete : codigo fuente-> generar...
			 */
			
			/*public boolean equals(Object obj) {
				
				if(obj instanceof Cliente) {
					
					Cliente otro=(Cliente)obj;//hacemos un casting
					
						if(this.n_cuenta==otro.n_cuenta) {
							return true;
						}else return false;
				}
				else return false;
				
			}*/
		
		/*
		 * metodo equals y hashcode automaticos:::::::::::::::::::
		 */
			
		@Override
		public int hashCode() {
			return Objects.hash(n_cuenta);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cliente other = (Cliente) obj;
			return Objects.equals(n_cuenta, other.n_cuenta);
		}
	
		
	
	//constructor-------------------------
	
	public Cliente(String nombre,String n_cuenta,Double saldo) {
		
		this.nombre=nombre;
		this.n_cuenta=n_cuenta;
		this.saldo=saldo;
		
	}





	private String nombre;
	private String n_cuenta;
	private Double saldo;
	

}
