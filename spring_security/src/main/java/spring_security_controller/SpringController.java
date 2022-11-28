package spring_security_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class SpringController {
	
	
	@GetMapping("/security")
	public String controller() {
		return "Spring security";
	}

}
