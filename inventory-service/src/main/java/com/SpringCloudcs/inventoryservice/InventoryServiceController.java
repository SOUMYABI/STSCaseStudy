package com.SpringCloudcs.inventoryservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class InventoryServiceController {
	@GetMapping("/Inventory")
	  public String bye() {
		  return "Hello World";
	  }
}


