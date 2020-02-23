package com.uptc.proyect.prg1.model;

import java.util.HashSet;


public class GroupCommodity {

	private HashSet<Commodity> commodities;

	public GroupCommodity() {
		this.commodities = new HashSet<>();
	}

	/**
	 * @description Este metodo agrega una mercancia
	 * @param name
	 * @param type
	 * @param code
	 * @param units
	 */
	public void addCommodity(String name,char type,String code,int units) {
		commodities.add(new Commodity(new Product(name,type, code), units));
	}
}
