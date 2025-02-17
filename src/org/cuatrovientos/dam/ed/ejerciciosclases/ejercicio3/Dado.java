package org.cuatrovientos.dam.ed.ejerciciosclases.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Dado {
	
	private String name;
	private List<Cara> caras = new ArrayList<Cara>();
	
	public Dado(int numeroCaras, String nombre) {
		
		for (int i = 0; i<numeroCaras; i++) {
			Cara cara = new Cara(i+1);
			caras.add(cara);
		}
		
		name = nombre;
	}
	
	public Dado(List<Cara> caras) {
		this.caras = caras;
		name = "Dado de "+caras.size()+ " caras";
	}
	

	
	public int lanzarDado() {
		Cara caraTrucada = this.caras.get(0);
		return caraTrucada.getValue();
		
	}

	public String getNombre() {
		return this.name;
	} 

}
