package org.cuatrovientos.dam.ed.ejerciciosclases.ejercicio2;

import java.util.List;

/**
 * 
 */
public class Invoice {

    private String customer;

    private List<Product> products;
    

    // Constructores
    public Invoice() {
    }

    public Invoice(String newCustomer) {
        this.customer = newCustomer;
    }

    /**
     * Añadir un producto a la factura
     */
    public void add(Product product) {
    	products.add(product);
    }

    /**
     * Quitar un producto de la lista según el índice
     */
    public void remove(int index) {
    	products.remove(index);
    }

    /**
     * Calcular el total de la lista de productos
     */
    public float total() {
       
    	float total = 0;
       
    	// Recorro la lista de productos y voy sumando el precio de cada producto
        for (Product product: products) {
        	total += product.total();
        }
        
        return total;
    }

}