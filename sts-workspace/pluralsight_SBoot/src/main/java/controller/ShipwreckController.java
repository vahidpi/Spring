package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {
	
	@RequestMapping(value="shipwrecks", method=RequestMethod.GET)
	public List<Shipwreck> list(){
		
	}
}
