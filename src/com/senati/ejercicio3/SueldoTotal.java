package com.senati.ejercicio3;
import java.util.Scanner;

public class SueldoTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float sueldo;
		float  venta1;
		float venta2;
		float venta3;
		float t_ventas;
		
		float comision;
		float total;
		
		sueldo = 34;
		venta1 = 12;
		venta2 = 14;
		venta3 = 11;

		
		t_ventas = venta1 + venta2 + venta3;
		comision = (float) (t_ventas*0.10);
		total = sueldo+comision;
		
		System.out.println("El total a pagar es: " + total);

	}
}
