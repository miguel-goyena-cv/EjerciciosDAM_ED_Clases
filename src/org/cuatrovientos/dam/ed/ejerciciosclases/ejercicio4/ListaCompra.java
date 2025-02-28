package org.cuatrovientos.dam.ed.ejerciciosclases.ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una lista de la compra
 */
public class ListaCompra {


    private List<ProductoLista> productos;
    
    public ListaCompra() {
    	productos = new ArrayList<ProductoLista>();
    }

    /**
     * Añadir un producto a la lista
     * @param producto
     */
    public void anadirProducto(ProductoLista producto) {
    	productos.add(producto);
    }

    /**
     * Devuelve la lista de todos los productos
     * @return
     */
    public String listarProductos() {
    	String lista = "Mi lista de productos: \n";
    	
    	for (ProductoLista producto: productos) {
			lista += producto.toString();
    	}
        return lista;
    }

    /**
     * @param producto
     */
    public void tacharProductos() {
    	
    	// Tacho todos los productos de la lista
    	for (ProductoLista producto: productos) {
    		producto.tachar();
    	}
    }

}