package com.inventory.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inventory {

	@Id
	private String id;
	private String itemName;
	private String type;
	private int quantity;
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inventory(String id, String itemName, String type, int quantity) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.type = type;
		this.quantity = quantity;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Inventory [id=" + id + ", itemName=" + itemName + ", type=" + type + ", quantity=" + quantity + "]";
	}
	
	
	
	
	
}
