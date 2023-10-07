package com.inventory.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inventory.models.Inventory;


public interface InventoryService {
	
	// Create new Inventory
	public Inventory createInventory(Inventory inventory);
	
//	Get all Inventory
	public List<Inventory>  getAll();
	
}
