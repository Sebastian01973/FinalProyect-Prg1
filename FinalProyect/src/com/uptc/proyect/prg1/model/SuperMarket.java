package com.uptc.proyect.prg1.model;

import java.util.ArrayList;
import java.util.HashSet;

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
	public void addClients(String name,byte age,String id) {
		buysOfClients.add(new BuyOfClient(new Client(name, age, id)));
	}
	
	/**
	 * @description Este metodo nos busca un buyClient segun la posicion
	 * @param index la poscion en la que esta
	 * @return el buyOfClient
	 */
	public String getBuyOfClients(int index){
		return buysOfClients.get(index).getClient().identificator;
	}
	
	/**
	 * @descrption Este metodo nos indica el tamaño del arrayList
	 * @return el tamaño
	 */
	public int size() {
		return buysOfClients.size();
	}
	
}
