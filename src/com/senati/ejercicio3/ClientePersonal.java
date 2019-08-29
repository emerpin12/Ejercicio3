package com.senati.ejercicio3;

public class ClientePersonal extends Libro{
		String nombre2;
		float contado;
		int credito;
		public ClientePersonal() {
			super();
		}
		public ClientePersonal(String nombre2, float contado, int credito) {
			super();
			this.nombre2 = nombre2;
			this.contado = contado;
			this.credito = credito;
		}
		/**
		 * @return the nombre2
		 */
		public String getNombre2() {
			return nombre2;
		}
		/**
		 * @param nombre2 the nombre2 to set
		 */
		public void setNombre2(String nombre2) {
			this.nombre2 = nombre2;
		}
		/**
		 * @return the contado
		 */
		public float getContado() {
			return contado;
		}
		/**
		 * @param contado the contado to set
		 */
		public void setContado(float contado) {
			this.contado = contado;
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
		@Override
		public String toString() {
			return "ClientePersonal [nombre2=" + nombre2 + ", contado=" + contado + ", credito=" + credito + ", id="
					+ id + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Float.floatToIntBits(contado);
			result = prime * result + credito;
			result = prime * result + ((nombre2 == null) ? 0 : nombre2.hashCode());
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
			ClientePersonal other = (ClientePersonal) obj;
			if (Float.floatToIntBits(contado) != Float.floatToIntBits(other.contado))
				return false;
			if (credito != other.credito)
				return false;
			if (nombre2 == null) {
				if (other.nombre2 != null)
					return false;
			} else if (!nombre2.equals(other.nombre2))
				return false;
			return true;
		}
		
		
}
