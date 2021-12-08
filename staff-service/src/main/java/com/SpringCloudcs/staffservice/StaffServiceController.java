package com.SpringCloudcs.staffservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StaffServiceController {
	@GetMapping("/Inventory")
	  public String bye() {
		  return "Hello World";
	  }

}
