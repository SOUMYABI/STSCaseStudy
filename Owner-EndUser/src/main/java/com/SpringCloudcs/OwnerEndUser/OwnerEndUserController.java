package com.SpringCloudcs.OwnerEndUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OwnerEndUserController {
	@GetMapping("/Inventory")
	  public String bye() {
		  return "Hello World";
	  }
}


