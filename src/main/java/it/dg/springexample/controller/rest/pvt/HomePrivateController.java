package it.dg.springexample.controller.rest.pvt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Grasso Domenico
 *
 *         Time: 16:37:16 Date: 24 apr 2020
 * 
 */
@RestController
public class HomePrivateController extends AbstractPrivateController {

	@GetMapping("/admin")
	public String welcomePrivate() {
		return "Hello from private Sir";
	}

	@GetMapping("/user")
	public String welcomeUserPrivate() {
		return "Hello from private common user";
	}
}
