package org.cuatrovientos.dam.ed.Artean;

import java.util.Date;

public class Usuario {

	private int numero;
	private static int maxNumero = 0;
	private String nombre;
	private Date fechaNacimiento;
	protected String password;

	public Usuario(String nombre, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.numero = maxNumero+1;
		maxNumero++;
	}
	
	public static boolean hemosCreadoUsuarios() {
		return maxNumero != 0;
	}

	public int obtenerEdad() {
		Usuario.hemosCreadoUsuarios();
		return 0;
		
	}

	public boolean cambiarPassword(String nuevoPassword) {

		// Aqui haremos los chequeos de passwords necesarios
		this.password = nuevoPassword;
		return true;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

}
