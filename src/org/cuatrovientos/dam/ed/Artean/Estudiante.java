package org.cuatrovientos.dam.ed.Artean;

import java.util.Date;

public class Estudiante extends Usuario implements Imprimible{

	public Estudiante(String nombre, Date fechaNacimiento) {
		super(nombre, fechaNacimiento);
	}
	
	public void apuntaOferta(OfertaEmpleo oferta ) {
		
	}

	@Override
	public boolean registrarse() {
		// TODO aqui pongo la lógica para el Empleador
		return false;
	}

	@Override
	public void imprimirEnPapel() {
		// TODO Hacer una imagen con IA con la información y sacarlo por impresora
		
	}

	@Override
	public void imprimirEnPantalla() {
		// TODO Hacer un HTML para verlo en pantalla completa en el navegador
		
	}
}
