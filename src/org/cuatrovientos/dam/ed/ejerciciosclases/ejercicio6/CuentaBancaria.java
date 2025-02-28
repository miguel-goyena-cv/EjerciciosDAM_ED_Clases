package org.cuatrovientos.dam.ed.ejerciciosclases.ejercicio6;

public class CuentaBancaria {
	
	protected String numero;
	protected String titular;
	protected float saldo;
	
	
	
	public CuentaBancaria(String numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.0f;
	}

	/**
	 * Para depositar dinero
	 * @param dinero
	 */
	public boolean depositar(float dinero) {
		
		saldo += dinero;
		return true;
		
	}
	
	/**
	 * Para retirar el dinero
	 * @param dinero
	 */
	public boolean retirar(float dinero) {
		
		// Si es mayor que el saldo no dejo
		if (dinero > saldo)
			return false;
		
		saldo -=dinero;
		return true;
		
	}

	public String mostrarInformacion() {
		return "CuentaBancaria [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	

}
