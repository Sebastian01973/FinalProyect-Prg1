package com.uptc.proyect.prg1.model;

public class Product {

	private String name; // Name
	private char type;
	private String code; // codigo
	
	public Product() {
		
	}
	
	/**
	 * @descrption Este es el contrucotr e inicializa las variables
	 * @param name
	 * @param type
	 * @param code
	 */
	public Product(String name, char type, String code) {
		this.name = name;
		this.type = type;
		this.code = code;
	}

	/**
	 * @description Este es el getter de name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @description Este es el getter de type
	 * @return the type
	 */
	public char getType() {
		return type;
	}

	/**
	 * @description Este es el getter de code
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	
	
}
