package com.inventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.models.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

}
