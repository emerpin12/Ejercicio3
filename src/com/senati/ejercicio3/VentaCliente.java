package com.senati.ejercicio3;

import java.util.HashSet;
import java.util.Set;


public class VentaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteCorporativo li01 = new ClienteCorporativo(1, "Los Gallinazos sin plumas", "Julio Ramon Ribeyro", 12, "Carlos", "Independencia", "Sala 012", 1345, 14);
		
		
		
		
		Set <ClienteCorporativo> clienteLibro = new HashSet<ClienteCorporativo>();
		
		clienteLibro.add(li01);
		
		
		for (ClienteCorporativo libro : clienteLibro) {
				System.out.println(libro.getId() + " , " + libro.getTitulo() + " , " + libro.getAutor() + " , " + libro.getPrecio() + " , " + libro.getNombre() + " , " + libro.getDireccion() + " , " + libro.getLugar() + " , " + libro.getCredito() + " , " + libro.getCalificacion());
		}
	}

}
