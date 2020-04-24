package it.dg.springexample.configuration.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import it.dg.springexample.data.domain.entity.UserEntity;
import it.dg.springexample.data.repository.UserRepository;

/**
 * @author Grasso Domenico
 *
 *         Time: 16:41:01 Date: 24 apr 2020
 * 
 */
@Component
public class UserAuthenticationManager implements AuthenticationProvider {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
		String password = (String) authentication.getCredentials();

		System.out.println("Username to find ----------> " + username);
		System.out.println("password to find ----------> " + password);

		UserEntity user = userRepository.findByUsernameAndPssword(username, password);
		if (user == null) {
			throw new BadCredentialsException("Bad credentials...");
		}

		List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
		grantedAuthorities.add(new SimpleGrantedAuthority(user.getRoleEntity().getRole()));
		return new UsernamePasswordAuthenticationToken(username, password, grantedAuthorities);

	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);

	}

}
