package Clases;

import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Encargado {
	private int id;
	private String nombre;
	private int contra;

	public Encargado(int id, String nombre, int contra) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.contra = contra;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getContra() {
		return contra;
	}

	public void setContra(int contra) {
		this.contra = contra;
	}

	@Override
	public String toString() {
		return "Encargado [id=" + id + ", nombre=" + nombre + ", contra=" + contra + "]";
	}

	public void IngresoEncargado() {
		// id = 1 contra = 23456
		boolean exitoso; // ingreso exitoso
		exitoso = false;
		String nom;
		int id, con;

		do {
			nom = JOptionPane.showInputDialog("Ingrese su nombre ");

			id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su id "));

			con = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Contraseña "));
			if (id == this.getId() && con == this.getContra()) {

				JOptionPane.showMessageDialog(null, "Usuario: " + this.getNombre() + " Ingreso correctamente ");
				exitoso = true;

			} else if (id != this.getId() || con != this.getContra()) {
				JOptionPane.showMessageDialog(null, " Datos incorrectos, ingresar otra vez ");
				exitoso = false;
			} else {
				JOptionPane.showMessageDialog(null, "Datos incorrectas, ingresar otra vez ");
			}
		} while (exitoso != true);

	}

	public static void generarVenta(LinkedList<Cafe> cafes, LinkedList<Venta> ventas) {

		int res;
		res = Integer.parseInt(JOptionPane.showInputDialog("Para ingresar la venta presione 1 "));
		int repetir = 0;
		do {
			switch (res) {
			case 1:
				int caf;
				caf = Integer.parseInt(JOptionPane.showInputDialog(
						"Cual cafe fue el vendido?" + "\n1=" + cafes.get(0).getCafe() + "\n2=" + cafes.get(1).getCafe()
								+ "\n3=" + cafes.get(2).getCafe() + "\n4=" + cafes.get(3).getCafe()));

				switch (caf) {
				case 1:
					int cant1;
					cant1 = Integer.parseInt(JOptionPane.showInputDialog("Cual fua la cantidad llevada?"));

					ventas.add(new Venta(1, cafes.get(0), cant1, false));
					int tarjeta1;
					tarjeta1 = Integer
							.parseInt(JOptionPane.showInputDialog("Tiene tarjeta de socio? \n1 para si \n2 para no"));

					if (tarjeta1 == 1) {
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
							double preciotot1;
							preciotot1 = cafes.get(0).getPrecio() * cant1;
							double desc1;
							desc1 = preciotot1 * 0.85;
							
							JOptionPane.showMessageDialog(null,
									"El precio total con el descuento incluido  es: $" + desc1);
						} else {
							double preciotot1;
							preciotot1 = cafes.get(0).getPrecio() * cant1;
							JOptionPane.showMessageDialog(null, "El precio total es: $" + preciotot1);
						}
					}
				
					break;
				case 2:

					int cant2;
					cant2 = Integer.parseInt(JOptionPane.showInputDialog("Cual fua la cantidad llevada?"));

					ventas.add(new Venta(1, cafes.get(1), cant2, false));
					int tarjeta2;
					tarjeta2 = Integer
							.parseInt(JOptionPane.showInputDialog("Tiene tarjeta de socio? \n1 para si \n2 para no"));

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
							JOptionPane.showMessageDialog(null,
									"El precio total con el descuento incluido  es: $" + desc2);
						} else {
							double preciotot2;
							preciotot2 = cafes.get(1).getPrecio() * cant2;
							JOptionPane.showMessageDialog(null, "El precio total es: $" + preciotot2);
						}
					}

					break;
				case 3:

					int cant3;
					cant3 = Integer.parseInt(JOptionPane.showInputDialog("Cual fua la cantidad llevada?"));

					ventas.add(new Venta(1, cafes.get(2), cant3, false));
					int tarjeta3;
					tarjeta3 = Integer
							.parseInt(JOptionPane.showInputDialog("Tiene tarjeta de socio? \n1 para si \n2 para no"));

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
							JOptionPane.showMessageDialog(null,
									"El precio total con el descuento incluido  es: $" + desc3);
						} else {
							double preciotot3;
							preciotot3 = cafes.get(2).getPrecio() * cant3;
							JOptionPane.showMessageDialog(null, "El precio total es: $" + preciotot3);
						}
					}
					break;

				case 4:

					int cant4;
					cant4 = Integer.parseInt(JOptionPane.showInputDialog("Cual fua la cantidad llevada?"));

					ventas.add(new Venta(1, cafes.get(3), cant4, false));
					int tarjeta4;

					tarjeta4 = Integer
							.parseInt(JOptionPane.showInputDialog("Tiene tarjeta de socio? \n1 para si \n2 para no"));
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
							JOptionPane.showMessageDialog(null,
									"El precio total con el descuento incluido  es: $" + desc4);
						} else {
							double preciotot4;
							preciotot4 = cafes.get(3).getPrecio() * cant4;
							JOptionPane.showMessageDialog(null, "El precio total es: $" + preciotot4);
						}
					}

					break;

				default:
					JOptionPane.showMessageDialog(null, "Respuesta no valida");
					break;
				}

				break;

			default:
				JOptionPane.showMessageDialog(null, "Respuesta no valida");
				break;
			}
			repetir = Integer
					.parseInt(JOptionPane.showInputDialog("Desea ingresar otra venta \n1. para si \n0. para no"));
		} while (repetir != 0);
	}

}
