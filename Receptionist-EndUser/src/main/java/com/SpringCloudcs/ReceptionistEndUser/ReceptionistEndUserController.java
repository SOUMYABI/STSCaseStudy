package com.SpringCloudcs.ReceptionistEndUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ReceptionistEndUserController {
	@GetMapping("/Inventory")
	  public String bye() {
		  return "Hello World";
	  }
}


