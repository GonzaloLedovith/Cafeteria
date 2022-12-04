package Clases;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Venta {
	private int id;
	private Cafe cafe;
	private int cantidad;
	private boolean tarjeta;

	public Venta(int id, Cafe cafe, int cantidad, boolean tarjeta) {
		super();
		this.id = id;
		this.cafe = cafe;
		this.cantidad = cantidad;
		this.tarjeta = tarjeta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cafe getCafe() {
		return cafe;
	}

	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(boolean tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cafe=" + cafe + ", cantidad=" + cantidad + ", tarjeta=" + tarjeta + "]";
	}

	public void mostrarVenta(LinkedList<Cafe> cafes, LinkedList<Venta> ventas) {
		int tot=0;
		for (int i = 0; i < ventas.size(); i++){
			tot++;
			JOptionPane.showMessageDialog(null,"Venta numero: "+ tot +  "\n" + "Producto: "
					+ ventas.get(i).getCafe().getCafe() + "\nCantidad: " + ventas.get(i).getCantidad());
	}
	}
	
	public void mostrarRecaudacion(LinkedList<Cafe> cafes, LinkedList<Venta> ventas) {
		double recaudado=0;
		
		for (int i = 0; i < ventas.size(); i++) {
			recaudado= ventas.get(i).getCafe().getPrecio() + recaudado;
			
			
	}
		JOptionPane.showMessageDialog(null, "Total recaudado en el dia de hoy: $" + recaudado);
}
	
	
}
