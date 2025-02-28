package org.cuatrovientos.dam.ed.ejerciciosclases.ejercicio4;

/**
 * Representa a un socio
 */

public class Socio {

	private String nombre;
	private ListaCompra listaCompra;
	
    public Socio(String nombre) {
    	this.nombre = nombre;
    	this.listaCompra = new ListaCompra();
    }

    /**
     * Hace la compra del socio
     */
    public void hacerCompra() {
        listaCompra.tacharProductos();
    }

    /**
     * Anade un producto a la compra de ese socio
     * @param nuevoProducto
     */
	public void anadeProductoLista(ProductoLista nuevoProducto) {
		listaCompra.anadirProducto(nuevoProducto);
	}

	/**
	 * Devuelve la lista de la compra actual del socio
	 * @return
	 */
	public ListaCompra getListaCompra() {
		return listaCompra;
	}
	

}