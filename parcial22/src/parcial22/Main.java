package parcial22;

import java.util.LinkedList;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Cafe Latte = new Cafe("Latte", 1.50);
		Cafe FlatWhite = new Cafe("Flat White", 2.50);
		Cafe Lagrima = new Cafe("Lagrima", 1.30);
		Cafe Expresso = new Cafe("Expresso", 1.00);

		LinkedList<Cafe> cafes = new LinkedList<Cafe>();
		cafes.add(Latte);
		cafes.add(FlatWhite);
		cafes.add(Lagrima);
		cafes.add(Expresso);

		LinkedList<Venta> ventas = new LinkedList<Venta>();

		Scanner entrada = new Scanner(System.in);

		int m = 0;
		do {
			System.out.println("Debera Ingresar para acceder al menu");
			// id = 1 contra = 23456
			IngresoEncargado();
			generarventa(cafes, ventas);
			System.out.println("Ingrese 9 para salir, cualquier otra tecla para volver al menu y continuar");
			m = entrada.nextInt();

		} while (m != 9);

	}

	public static void generarventa(LinkedList<Cafe> cafes, LinkedList<Venta> ventas) {
		System.out.println("que desea hacer: \n1=ingresar venta  \n2=finalizar dia");
		Scanner entrada = new Scanner(System.in);
		int res;
		res = entrada.nextInt();
		switch (res) {
		case 1:
			int caf;
			System.out.println("cual cafe fue el vendido?" + "\n1=" + cafes.get(0).getCafe() + "\n2="
					+ cafes.get(1).getCafe() + "\n3=" + cafes.get(2).getCafe() + "\n3=" + cafes.get(3).getCafe());
			caf = entrada.nextInt();
			switch (caf) {
			case 1:
				System.out.println("cual fua la cantidad llevada?");
				int cant;
				cant = entrada.nextInt();

				ventas.add(new Venta(1, cafes.get(0), cant, false));
				int tarjeta;
				System.out.println("tiene tarjeta de socio? 1 para si, 2 para no");
				tarjeta = entrada.nextInt();
				if (tarjeta == 1) {
					for (int i = 0; i < ventas.size(); i++) {
						ventas.get(i).setTarjeta(true);
					}

				} else {
					for (int i = 0; i < ventas.size(); i++) {
						ventas.get(i).setTarjeta(false);
					}

				}
				for (int i = 0; i < ventas.size(); i++) {
					if (ventas.get(i).isTarjeta() == true) {
						double preciotot;
						preciotot = cafes.get(0).getPrecio() * cant;
						double desc;
						desc = preciotot * 0.85;
						System.out.println("el precio total con el descuento incluido  es: $" + desc);
					} else {
						double preciotot;
						preciotot = cafes.get(1).getPrecio() * cant;
						System.out.println("el precio total es: $" + preciotot);
					}
				}

				for (int i = 0; i < ventas.size(); i++) {
					System.out.println("Las ventas del dia fueron: \n" + "Producto: "
							+ ventas.get(i).getCafe().getCafe() + "\nCantidad: " + ventas.get(i).getCantidad());
				}
				break;
			case 2:
				System.out.println("cual fua la cantidad llevada?");
				int cant2;
				cant2 = entrada.nextInt();

				ventas.add(new Venta(1, cafes.get(1), cant2, false));
				int tarjeta2;
				System.out.println("tiene tarjeta de socio? 1 para si, 2 para no");
				tarjeta2 = entrada.nextInt();
				if (tarjeta2 == 1) {
					for (int i = 0; i < ventas.size(); i++) {
						ventas.get(i).setTarjeta(true);
					}

				} else {
					for (int i = 0; i < ventas.size(); i++) {
						ventas.get(i).setTarjeta(false);
					}

				}
				for (int i = 0; i < ventas.size(); i++) {
					if (ventas.get(i).isTarjeta() == true) {
						double preciotot2;
						preciotot2 = cafes.get(1).getPrecio() * cant2;
						double desc2;
						desc2 = preciotot2 * 0.85;
						System.out.println("el precio total con el descuento incluido  es: $" + desc2);
					} else {
						double preciotot2;
						preciotot2 = cafes.get(1).getPrecio() * cant2;
						System.out.println("el precio total es: $" + preciotot2);
					}
				}

				for (int i = 0; i < ventas.size(); i++) {
					System.out.println("Las ventas del dia fueron: \n" + "Producto: "
							+ ventas.get(i).getCafe().getCafe() + "\nCantidad: " + ventas.get(i).getCantidad());
				}
				break;
			case 3:
				System.out.println("cual fua la cantidad llevada?");
				int cant3;
				cant3 = entrada.nextInt();

				ventas.add(new Venta(1, cafes.get(2), cant3, false));
				int tarjeta3;
				System.out.println("tiene tarjeta de socio? 1 para si, 2 para no");
				tarjeta3 = entrada.nextInt();
				if (tarjeta3 == 1) {
					for (int i = 0; i < ventas.size(); i++) {
						ventas.get(i).setTarjeta(true);
					}

				} else {
					for (int i = 0; i < ventas.size(); i++) {
						ventas.get(i).setTarjeta(false);
					}

				}
				for (int i = 0; i < ventas.size(); i++) {
					if (ventas.get(i).isTarjeta() == true) {
						double preciotot3;
						preciotot3 = cafes.get(2).getPrecio() * cant3;
						double desc3;
						desc3 = preciotot3 * 0.85;
						System.out.println("el precio total con el descuento incluido  es: $" + desc3);
					} else {
						double preciotot3;
						preciotot3 = cafes.get(2).getPrecio() * cant3;
						System.out.println("el precio total es: $" + preciotot3);
					}
				}

				for (int i = 0; i < ventas.size(); i++) {
					System.out.println("Las ventas del dia fueron: \n" + "Producto: "
							+ ventas.get(i).getCafe().getCafe() + "\nCantidad: " + ventas.get(i).getCantidad());
				}
			case 4:
				System.out.println("cual fua la cantidad llevada?");
				int cant4;
				cant4 = entrada.nextInt();

				ventas.add(new Venta(1, cafes.get(3), cant4, false));
				int tarjeta4;
				System.out.println("tiene tarjeta de socio? 1 para si, 2 para no");
				tarjeta4 = entrada.nextInt();
				if (tarjeta4 == 1) {
					for (int i = 0; i < ventas.size(); i++) {
						ventas.get(i).setTarjeta(true);
					}

				} else {
					for (int i = 0; i < ventas.size(); i++) {
						ventas.get(i).setTarjeta(false);
					}

				}
				for (int i = 0; i < ventas.size(); i++) {
					if (ventas.get(i).isTarjeta() == true) {
						double preciotot4;
						preciotot4 = cafes.get(3).getPrecio() * cant4;
						double desc4;
						desc4 = preciotot4 * 0.85;
						System.out.println("el precio total con el descuento incluido  es: $" + desc4);
					} else {
						double preciotot4;
						preciotot4 = cafes.get(3).getPrecio() * cant4;
						System.out.println("el precio total es: $" + preciotot4);
					}
				}

				for (int i = 0; i < ventas.size(); i++) {
					System.out.println("Las ventas del dia fueron: \n" + "Producto: "
							+ ventas.get(i).getCafe().getCafe() + "\nCantidad: " + ventas.get(i).getCantidad());
				}
				break;

			default:
				System.out.println("respuesta no valida");
				break;
			}

			break;
	
		default:
			System.out.println("respuesta no valida");
			break;
		}
	}

	public static void IngresoEncargado() {
		// id = 1 contra = 23456
		boolean exitoso; // ingreso exitoso
		String nom;
		int id, con;
		System.out.println("Ingrese su nombre ");
		Scanner sc = new Scanner(System.in);
		nom = sc.next();
		Encargado e1 = new Encargado(nom);

		System.out.println("Ingrese su id ");
		id = sc.nextInt();
		System.out.println("Ingrese su Contraseña ");
		con = sc.nextInt();

		do {

			if (id == e1.getId() && con == e1.getContra()) {

				System.out.println("Usuario: " + e1.getNombre() + " Ingreso correctamente ");
				exitoso = true;

			} else if (id != e1.getId()) {
				System.out.println("Id Incorrecto, ingreseselo otra vez ");
				exitoso = false;
			} else if (con != e1.getContra()) {

				System.out.println("Contra Incorrecta, ingresesela otra vez ");
				exitoso = false;
			}
		} while (exitoso = false);
	}

}
