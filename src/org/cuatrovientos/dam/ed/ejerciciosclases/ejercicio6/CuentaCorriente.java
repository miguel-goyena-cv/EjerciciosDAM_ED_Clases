package org.cuatrovientos.dam.ed.ejerciciosclases.ejercicio6;

/**
 * Es una cuenta bancaria donde tenemos un limite de descubierto
 */
public class CuentaCorriente extends CuentaBancaria {

	private float limite;
	
	
	public CuentaCorriente(String numero, String titular, float limite) {
		super(numero, titular);
		this.limite = limite;
	}

	/**
	 * Para retirar el dinero, tiene en cuenta el limite.
	 * @param dinero
	 */
	public boolean retirar(float dinero) {
		
		// Si es mayor que el saldo + el limite entonces no dejo
		if (dinero > (saldo+limite))
			return false;
		
		saldo -=dinero;
		return true;
		
	}
	
}
