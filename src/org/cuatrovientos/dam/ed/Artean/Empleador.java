package org.cuatrovientos.dam.ed.Artean;

import java.util.Date;

public class Empleador extends Usuario {
	
	private Empresa miEmpresa;

	public Empleador(String nombre, Date fechaNacimiento, Empresa miEmpresa) {
		super(nombre, fechaNacimiento);
		this.miEmpresa = miEmpresa;
	}
	
	public OfertaEmpleo crearOferta() {
		return new OfertaEmpleo();
	}
	
	public boolean cambiarPassword(String nuevoPassword) {

		// Aqui hacemos chequeos especificos para el Empleador
		super.password = nuevoPassword;
		return true;
	}

	@Override
	public boolean registrarse() {
		// TODO aqui pongo la lógica para el Empleador
		return false;
	}

}
