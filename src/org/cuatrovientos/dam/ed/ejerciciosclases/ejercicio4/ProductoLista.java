package org.cuatrovientos.dam.ed.ejerciciosclases.ejercicio4;

/**
 * Identifica a un producto dentro de la Lista de la compra
 */
public class ProductoLista {

    private String nombre;
    private int cantidad;
    private boolean tachado;
    
	public ProductoLista(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ProductoLista [nombre=" + nombre + ", cantidad=" + cantidad + ", tachado=" + tachado + "]";
	}

	public void tachar() {
		this.tachado = true;
	}
    

}