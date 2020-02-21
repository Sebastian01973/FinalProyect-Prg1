package com.uptc.proyect.prg1.model;

import java.util.HashSet;

/**
 * @descrption Este clase es la de un cliente 
 * @author Sebastian Martinez
 * @date 19/02/2020
 */
public class Client extends Person{

	
	public Client(String name, byte age, String identificator) {
		super(name, age, identificator);
	}
	
	
	/**
	 * @descrpiton Este metodo nos dice si esta bien la contraseña
	 * @param password
	 * @return true si cumple false si no
	 */
	public boolean isValidatePassword(String password) {
		return this.identificator.equals(password);
	}
	
}
