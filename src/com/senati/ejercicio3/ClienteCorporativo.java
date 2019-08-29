package com.senati.ejercicio3;

public class ClienteCorporativo extends Libro {
		String nombre;
		String direccion;
		String lugar;
		int credito;
		int calificacion;
		public ClienteCorporativo() {
			super();
		}
		public ClienteCorporativo(int id, String titulo, String autor, float precio, String nombre, String direccion, String lugar, int credito, int calificacion) {
			super(id, titulo, autor, precio);
			this.nombre = nombre;
			this.direccion = direccion;
			this.lugar = lugar;
			this.credito = credito;
			this.calificacion = calificacion;
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
		 * @return the direccion
		 */
		public String getDireccion() {
			return direccion;
		}
		/**
		 * @param direccion the direccion to set
		 */
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		/**
		 * @return the lugar
		 */
		public String getLugar() {
			return lugar;
		}
		/**
		 * @param lugar the lugar to set
		 */
		public void setLugar(String lugar) {
			this.lugar = lugar;
		}
		/**
		 * @return the credito
		 */
		public int getCredito() {
			return credito;
		}
		/**
		 * @param credito the credito to set
		 */
		public void setCredito(int credito) {
			this.credito = credito;
		}
		/**
		 * @return the calificacion
		 */
		public int getCalificacion() {
			return calificacion;
		}
		/**
		 * @param calificacion the calificacion to set
		 */
		public void setCalificacion(int calificacion) {
			this.calificacion = calificacion;
		}
		@Override
		public String toString() {
			return "ClienteCorporativo [nombre=" + nombre + ", direccion=" + direccion + ", lugar=" + lugar
					+ ", credito=" + credito + ", calificacion=" + calificacion + ", id=" + id + ", titulo=" + titulo
					+ ", autor=" + autor + ", precio=" + precio + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + calificacion;
			result = prime * result + credito;
			result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
			result = prime * result + ((lugar == null) ? 0 : lugar.hashCode());
			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			ClienteCorporativo other = (ClienteCorporativo) obj;
			if (calificacion != other.calificacion)
				return false;
			if (credito != other.credito)
				return false;
			if (direccion == null) {
				if (other.direccion != null)
					return false;
			} else if (!direccion.equals(other.direccion))
				return false;
			if (lugar == null) {
				if (other.lugar != null)
					return false;
			} else if (!lugar.equals(other.lugar))
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}
		
	
}
