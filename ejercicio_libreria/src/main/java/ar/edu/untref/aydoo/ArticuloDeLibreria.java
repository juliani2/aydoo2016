package ar.edu.untref.aydoo;

public class ArticuloDeLibreria extends Producto {

	public ArticuloDeLibreria(String nombre, double precio) {
		super.setNombre(nombre);
		super.setPrecio(precio*1.21);
	}
}
