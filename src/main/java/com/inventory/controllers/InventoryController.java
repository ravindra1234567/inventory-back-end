package com.inventory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.models.Inventory;
import com.inventory.services.InventoryService;

@RestController
@CrossOrigin("*")
@RequestMapping("/inventories")
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@PostMapping("/create")
	public ResponseEntity<Inventory> create(@RequestBody Inventory inventory ){
		
		System.out.println("Inventory = "+ inventory);
		
		Inventory data = inventoryService.createInventory(inventory);
		
		return new ResponseEntity<Inventory>(data, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Inventory>> getAll(){
		
		List<Inventory> list = inventoryService.getAll();
		
		return new ResponseEntity<List<Inventory>>(list,HttpStatus.OK);
		
	}

}
