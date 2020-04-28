package it.dg.springexample.controller.rest.pvt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.dg.springexample.data.domain.entity.UserEntity;
import it.dg.springexample.data.repository.UserRepository;

/**
 * @author Grasso Domenico
 *
 *         Time: 16:37:16 Date: 24 apr 2020
 * 
 */
@RestController
public class HomePrivateController extends AbstractPrivateController {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("/admin")
	public String welcomePrivate() {
		return "Hello from private Sir";
	}

	@GetMapping("/admin/res")
	public List<UserEntity> welcomeUserPrivate() {
		return this.userRepo.findAll();
	}
}
