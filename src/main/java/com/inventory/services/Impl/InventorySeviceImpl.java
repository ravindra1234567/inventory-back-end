package com.inventory.services.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.models.Inventory;
import com.inventory.repositories.InventoryRepository;
import com.inventory.services.InventoryService;

@Service
public class InventorySeviceImpl implements InventoryService {
	
	@Autowired
	private InventoryRepository inventoryRepository; 

	@Override
	public Inventory createInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		String id = UUID.randomUUID().toString();
		inventory.setId(id);
		return inventoryRepository.save(inventory);
	}

	@Override
	public List<Inventory> getAll() {
		// TODO Auto-generated method stub
		return inventoryRepository.findAll();
	}

}
