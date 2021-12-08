package com.SpringCloudcs.ManagerEndUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ManagerEndUserController {
	@GetMapping("/Inventory")
	  public String bye() {
		  return "Hello World";
	  }
}


