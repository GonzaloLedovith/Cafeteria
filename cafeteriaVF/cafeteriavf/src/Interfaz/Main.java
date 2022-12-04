package Interfaz;

import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Clases.Cafe;
import Clases.Encargado;
import Clases.Venta;

class Main {

	public static void main(String[] args) {
		Cafe Latte = new Cafe("Latte", 1.50);
		Cafe FlatWhite = new Cafe("FlatWhite", 2.50);
		Cafe Lagrima = new Cafe("Lagrima", 1.30);
		Cafe Expresso = new Cafe("Expresso", 1.00);
		
		Encargado encargado1 = new Encargado(1,"", 23456);
		
		Venta nuevaVenta = new Venta (0, new Cafe("",0), 0, false);

		LinkedList<Cafe> cafes = new LinkedList<Cafe>();
		cafes.add(Latte);
		cafes.add(FlatWhite);
		cafes.add(Lagrima);
		cafes.add(Expresso);

		LinkedList<Venta> ventas = new LinkedList<Venta>();

		JOptionPane.showMessageDialog(null, "Debera Ingresar para acceder al menu");
			encargado1.IngresoEncargado();
	
		int m = 0;
		do {
			
			// id = 1 contra = 23456
			
			encargado1.generarVenta(cafes, ventas);
			m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 9 para finalizar el dia, cualquier otra tecla para volver a ingresar alguna venta"));

		} while (m != 9);
		
		int opc;
		
		opc = Integer.parseInt(JOptionPane.showInputDialog("Que lista le gustaria ver:  \n1. Ventas del dia "
				+ " \n2. Recaudacion Total. "));

		switch (opc) {
		case 1:
			nuevaVenta.mostrarVenta(cafes, ventas);
			break;

		case 2:
			nuevaVenta.mostrarRecaudacion(cafes, ventas);
			break;
			
		
		default:
			break;
		}
		
		

	}

   

	
	/*for (int i = 0; i < ventas.size(); i++) {
		JOptionPane.showMessageDialog(null,"Las ventas del dia fueron: \n" + "Producto: "
				+ ventas.get(i).getCafe().getCafe() + "\nCantidad: " + ventas.get(i).getCantidad());
	}*/
}
