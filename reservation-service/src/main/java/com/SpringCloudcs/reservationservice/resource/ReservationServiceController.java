package com.SpringCloudcs.reservationservice.resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")

public class ReservationServiceController {
	@RequestMapping("/Reservation")
	  public String bye() {
		  return "Hello World";
	  }

}
