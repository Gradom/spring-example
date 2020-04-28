package it.dg.springexample.configuration.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Grasso Domenico
 *
 *         Time: 16:40:01 Date: 24 apr 2020
 * 
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserAuthenticationManager authManager;

	@Autowired
	private BasicAuthenticationEntryPointConfig authEntryPoint;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/private/admin/**").hasRole("ADMIN").antMatchers("/private/user/**")
				.hasRole("USER").and().httpBasic().authenticationEntryPoint(authEntryPoint).and().logout()
				.logoutUrl("/logout").permitAll().logoutSuccessUrl("/public/").clearAuthentication(true)
				.invalidateHttpSession(true).deleteCookies("JSESSIONID");

		http.csrf().disable();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authManager);
	}
}
