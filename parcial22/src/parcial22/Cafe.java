package parcial22;

public class Cafe {
private String cafe;
private double precio;
public Cafe(String cafe, double precio) {
	super();
	this.cafe = cafe;
	this.precio = precio;
}

public String getCafe() {
	return cafe;
}
public void setCafe(String cafe) {
	this.cafe = cafe;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
@Override
public String toString() {
	return "Cafe [cafe=" + cafe + ", precio=" + precio + "]";
}

}
