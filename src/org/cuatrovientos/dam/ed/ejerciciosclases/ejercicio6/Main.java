package org.cuatrovientos.dam.ed.ejerciciosclases.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<CuentaBancaria> listadoCuentasBanco = new ArrayList<CuentaBancaria>();

		// Creo una cuenta bancaria simple
		CuentaBancaria nuevaCuentaSimple = new CuentaBancaria("12345", "Miguel Goyena");
		nuevaCuentaSimple.depositar(3);
		nuevaCuentaSimple.retirar(2);
		System.out.println("Mi nueva cuenta es: " + nuevaCuentaSimple.mostrarInformacion());
		listadoCuentasBanco.add(nuevaCuentaSimple);
		
		
		// Creo una cuenta ahorro
		CuentaAhorro nuevaCuentaAhorro = new CuentaAhorro("123456", "Miguel Goyena 2");
		nuevaCuentaAhorro.depositar(3);
		nuevaCuentaAhorro.aplicarInteres();
		System.out.println("Mi nueva cuenta de ahorro es: " + nuevaCuentaAhorro.mostrarInformacion());
		listadoCuentasBanco.add(nuevaCuentaAhorro);
		
		// Creo una cuenta corriente
		CuentaCorriente nuevaCuentaCorriente = new CuentaCorriente("1234567", "Miguel Goyena 3", 1000);
		nuevaCuentaCorriente.depositar(3);
		nuevaCuentaCorriente.retirar(100);
		System.out.println("Mi nueva cuenta corriente es: " + nuevaCuentaCorriente.mostrarInformacion());
		listadoCuentasBanco.add(nuevaCuentaCorriente);
		
	}

}
