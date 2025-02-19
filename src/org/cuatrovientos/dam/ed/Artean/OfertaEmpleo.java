package org.cuatrovientos.dam.ed.Artean;

import java.util.Date;
import java.util.List;

public class OfertaEmpleo  implements Imprimible{
	
	private String puesto;
	private Empresa empresa;
	private float sueldo;
	private Date fechaCreacion;
	private Date fechaExpiracion;
	private List<Candidato> candidatos;
	private List<Candidatura> candidaturas;
	
	@Override
	public void imprimirEnPapel() {
		// TODO Todavia no sabemos como representarlo!!!
		
	}
	@Override
	public void imprimirEnPantalla() {
		// TODO Todavia no sabemos como representarlo!!!
		
	}

}
