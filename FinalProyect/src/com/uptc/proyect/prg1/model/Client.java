package com.uptc.proyect.prg1.model;

import java.util.HashSet;

/**
 * @descrption Este clase es la de un cliente 
 * @author Sebastian Martinez
 * @date 19/02/2020
 */
public class Client extends Person{

	private String password; // Contraseña
	
	public Client(String name, byte age, String identificator, String password) {
		super(name, age, identificator);
		this.password = password;
	}
	

	/**
	 * description Este metodo nos devuelve la contraseña
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @descrpiton Este metodo nos dice si esta bien la contraseña
	 * @param password
	 * @return true si cumple false si no
	 */
	public boolean isValidatePassword(String password) {
		return this.password.equals(password);
	}
	
}
