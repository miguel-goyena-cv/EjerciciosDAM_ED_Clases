package org.cuatrovientos.dam.ed.ejerciciosclases.ejercicio1;

public class Customer {
	
	public String name;
	public String surname;
	public int age;
	private boolean single;
	private String country;
	
	
	
	public Customer(String name) {
		super();
		single = true;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Customer [name=" + name + ", surname=" + surname + ", age=" + age + ", single=" + single + ", country="
				+ country + "]";
	}


	private void doSomething() {
		//TODO no se ni que hace
	}
	
	

}
