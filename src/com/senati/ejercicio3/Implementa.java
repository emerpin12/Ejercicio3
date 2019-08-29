package com.senati.ejercicio3;

public class Implementa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro();
		libro1.id = 1;
		libro1.titulo = "Los gallinazos sin plumas";
		libro1.autor = "Julio Ramon Ribeyro";
		libro1.precio = 12;
		
		System.out.println(libro1.toString());
		
		Vendedor vendedor1 = new Vendedor();
		vendedor1.id = 12;
		vendedor1.nombre1 ="Manuel";
		vendedor1.sueldo = 14;
		vendedor1.comision = 1;
		
		System.out.println(vendedor1.toString());
		
		
	}

}
