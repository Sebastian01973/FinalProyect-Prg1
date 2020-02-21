package com.uptc.proyect.prg1.model;

public class BuyOfClient {

	private Client client;
	private GroupCommodity products;
	
	public BuyOfClient(Client client) {
		this.client = client;
	}
	

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @return the products
	 */
	public GroupCommodity getProducts() {
		return products;
	}
	
	
	
}
