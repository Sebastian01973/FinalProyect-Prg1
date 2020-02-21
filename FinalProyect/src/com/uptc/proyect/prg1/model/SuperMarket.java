package com.uptc.proyect.prg1.model;

import java.util.ArrayList;

public class SuperMarket {

	private ArrayList<BuyOfClient> buysOfClients;
	private Administrator administrator;
	
	public SuperMarket() {
		this.buysOfClients = new ArrayList<>();
	}
	
	/**
	 * descrption Este metodo nos agrega un nuevo cliente.
	 * @param name el nombre
	 * @param age la edad
	 * @param id la identificacion
	 * @param password la contraseña
	 */
	public void addClients(String name,byte age,String id,String password) {
		buysOfClients.add(new BuyOfClient(new Client(name, age, id, password)));
	}
	
	
	
	public void print() {
		for (BuyOfClient buyOfClient : buysOfClients) {
			System.out.println(buyOfClient.getClient().name + buyOfClient.getClient().age);
		}
	}
	
	
}
