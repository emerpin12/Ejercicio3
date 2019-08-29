package com.senati.ejercicio3;

public class Vendedor {
		int id;
		String nombre1;
		int sueldo;
		float comision;
		public Vendedor() {
			super();
		}
		public Vendedor(int id, String nombre1, int sueldo, float comision) {
			super();
			this.id = id;
			this.nombre1 = nombre1;
			this.sueldo = sueldo;
			this.comision = comision;
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
		 * @return the nombre1
		 */
		public String getNombre1() {
			return nombre1;
		}
		/**
		 * @param nombre1 the nombre1 to set
		 */
		public void setNombre1(String nombre1) {
			this.nombre1 = nombre1;
		}
		/**
		 * @return the sueldo
		 */
		public int getSueldo() {
			return sueldo;
		}
		/**
		 * @param sueldo the sueldo to set
		 */
		public void setSueldo(int sueldo) {
			this.sueldo = sueldo;
		}
		/**
		 * @return the comision
		 */
		public float getComision() {
			return comision;
		}
		/**
		 * @param comision the comision to set
		 */
		public void setComision(float comision) {
			this.comision = comision;
		}
		@Override
		public String toString() {
			return "Vendedor [id=" + id + ", nombre1=" + nombre1 + ", sueldo=" + sueldo + ", comision=" + comision
					+ "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Float.floatToIntBits(comision);
			result = prime * result + id;
			result = prime * result + ((nombre1 == null) ? 0 : nombre1.hashCode());
			result = prime * result + sueldo;
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
			Vendedor other = (Vendedor) obj;
			if (Float.floatToIntBits(comision) != Float.floatToIntBits(other.comision))
				return false;
			if (id != other.id)
				return false;
			if (nombre1 == null) {
				if (other.nombre1 != null)
					return false;
			} else if (!nombre1.equals(other.nombre1))
				return false;
			if (sueldo != other.sueldo)
				return false;
			return true;
		}
	
		
}
