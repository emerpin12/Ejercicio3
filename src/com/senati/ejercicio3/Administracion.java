package com.senati.ejercicio3;

public class Administracion {
		int id;
		String nombre;
		float sueldo;
		int seguro;
		public Administracion() {
			super();
		}
		public Administracion(int id, String nombre, float sueldo, int seguro) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.sueldo = sueldo;
			this.seguro = seguro;
		}
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * @return the sueldo
		 */
		public float getSueldo() {
			return sueldo;
		}
		/**
		 * @param sueldo the sueldo to set
		 */
		public void setSueldo(float sueldo) {
			this.sueldo = sueldo;
		}
		/**
		 * @return the seguro
		 */
		public int getSeguro() {
			return seguro;
		}
		/**
		 * @param seguro the seguro to set
		 */
		public void setSeguro(int seguro) {
			this.seguro = seguro;
		}
		@Override
		public String toString() {
			return "Administracion [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + ", seguro=" + seguro
					+ "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
			result = prime * result + seguro;
			result = prime * result + Float.floatToIntBits(sueldo);
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Administracion other = (Administracion) obj;
			if (id != other.id)
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			if (seguro != other.seguro)
				return false;
			if (Float.floatToIntBits(sueldo) != Float.floatToIntBits(other.sueldo))
				return false;
			return true;
		}
		
}
