package org.cuatrovientos.dam.ed.ejerciciosclases.ejercicio4;

public class Main {

	public static void main(String[] args) {

		// Creo un socio
		System.out.println("Voy a crear un socio");
		Socio nuevoSocio = new Socio("Miguel Goyena");
		
		// Voy a comprar un producto
		ProductoLista nuevoProducto = new ProductoLista("chuleton", 3);
		nuevoSocio.anadeProductoLista(nuevoProducto);
		
		// Voy a finalizar compra
		nuevoSocio.hacerCompra();
		
		// Voy a listar los productos que he comprado
		System.out.println(nuevoSocio.getListaCompra().listarProductos());

	}

}
