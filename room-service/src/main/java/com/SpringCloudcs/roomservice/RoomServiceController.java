package com.SpringCloudcs.roomservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RoomServiceController {
	@GetMapping("/Inventory")
	  public String bye() {
		  return "Hello World";
	  }

}
