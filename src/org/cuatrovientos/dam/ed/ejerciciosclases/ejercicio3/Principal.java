package org.cuatrovientos.dam.ed.ejerciciosclases.ejercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Escribimos la peticion al usuario
		System.out.print("Dime el numero de caras del dado: ");
		String numeroCarasString = scan.nextLine();
		int numeroCaras = Integer.parseInt(numeroCarasString);
		
		// Ya puedo crear el dado
		Dado miDado = new Dado(numeroCaras);
		
		//Lanzar el dado
		int resultado = miDado.lanzarDado();
		
		//Escribo por pantalla
		System.out.println("El resultado del dado es: "+resultado);

	}

}
