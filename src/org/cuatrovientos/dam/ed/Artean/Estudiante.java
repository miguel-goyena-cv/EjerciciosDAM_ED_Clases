package org.cuatrovientos.dam.ed.Artean;

import java.util.Date;

public class Estudiante extends Usuario {

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

}
