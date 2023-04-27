package com.ivisecurity.inventoryManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ivisecurity.inventoryManagement.entity.InventoryEntity;
import com.ivisecurity.inventoryManagement.repository.InventoryRepository;

@RestController
public class InventoryController {
	@Autowired
	private InventoryRepository Repository;
	
	@GetMapping("/listOfInventories")
	public List<InventoryEntity> getall() {
		return Repository.findAll();
	}
	
	@PostMapping("/adddevice")
	public InventoryEntity adddevice(@RequestBody InventoryEntity entity) {
		return Repository.save(entity);
	}
}
