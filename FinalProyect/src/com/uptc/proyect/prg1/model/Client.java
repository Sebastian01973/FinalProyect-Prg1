package com.uptc.proyect.prg1.model;

import java.util.HashSet;

/**
 * @descrption Este clase es la de un cliente 
 * @author Sebastian Martinez
 * @date 19/02/2020
 */
public class Client extends Person{

	
	/**
	 * @description Este es el contrucotr e inicializa un cliente
	 * @param name
	 * @param age
	 * @param identificator
	 */
	public Client(String name, byte age, String identificator) {
		super(name, age, identificator);
	}
	
	/**
	 * @descrpiton Este metodo nos dice si esta bien el nickname
	 * @param nickName
	 * @return true si cumple false si no
	 */
	public boolean isValidateNickName(String nickName) {
		return this.identificator.equals(nickName);
	}
	
}
