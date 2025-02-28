package org.cuatrovientos.dam.ed.ejerciciosclases.ejercicio6;

/**
 * Es una cuenta bancaria donde año a año aplicamos un interes
 */
public class CuentaAhorro extends CuentaBancaria {
	
	private static float interes = 3.2f;
	
	
	public CuentaAhorro(String numero, String titular) {
		super(numero, titular);
	}


	/**
	 * Aplicamos el interes a la cuenta
	 */
	public void aplicarInteres() {
		super.saldo += (super.saldo*interes)/100.0f;
	}



	/**
	 * Devuelve la informacion  de esta cuenta
	 */
	public String mostrarInformacion() {
		return "CuentaAhorro [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + ", Interes: "+interes+"]";
	}
	

}
