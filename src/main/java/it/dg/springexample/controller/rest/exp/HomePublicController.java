package it.dg.springexample.controller.rest.exp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.dg.springexample.data.domain.entity.UserEntity;
import it.dg.springexample.data.repository.UserRepository;

@RestController
public class HomePublicController extends AbstractPublicRestController {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("/")
	public String welcomeService() {
		return "Welcome!!!";
	}

	@GetMapping("/users")
	public List<UserEntity> users() {
		return this.userRepo.findAll();
	}
}
