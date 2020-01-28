package it.dg.springexample.controller.rest.exp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePublicController extends AbstractPublicRestController {

	@GetMapping("")
	public String welcomeService() {
		return "Welcome!!!";
	}
}
