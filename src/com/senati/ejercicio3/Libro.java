package com.senati.ejercicio3;

public class Libro {
		int id;
		String titulo;
		String autor;
		float precio;
		public Libro() {
			super();
		}
		public Libro(int id, String titulo, String autor, float precio) {
			super();
			this.id = id;
			this.titulo = titulo;
			this.autor = autor;
			this.precio = precio;
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
		 * @return the titulo
		 */
		public String getTitulo() {
			return titulo;
		}
		/**
		 * @param titulo the titulo to set
		 */
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		/**
		 * @return the autor
		 */
		public String getAutor() {
			return autor;
		}
		/**
		 * @param autor the autor to set
		 */
		public void setAutor(String autor) {
			this.autor = autor;
		}
		/**
		 * @return the precio
		 */
		public float getPrecio() {
			return precio;
		}
		/**
		 * @param precio the precio to set
		 */
		public void setPrecio(float precio) {
			this.precio = precio;
		}
		@Override
		public String toString() {
			return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((autor == null) ? 0 : autor.hashCode());
			result = prime * result + id;
			result = prime * result + Float.floatToIntBits(precio);
			result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
			Libro other = (Libro) obj;
			if (autor == null) {
				if (other.autor != null)
					return false;
			} else if (!autor.equals(other.autor))
				return false;
			if (id != other.id)
				return false;
			if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
				return false;
			if (titulo == null) {
				if (other.titulo != null)
					return false;
			} else if (!titulo.equals(other.titulo))
				return false;
			return true;
		}
		
}
