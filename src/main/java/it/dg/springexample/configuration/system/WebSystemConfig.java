package it.dg.springexample.configuration.system;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Grasso Domenico
 *
 *         Time: 12:38:43 Date: 24 apr 2020
 * 
 *         This config class is equivalent to servlet.xml file and is necessary
 *         to enable Spring. Whith it, the framework start the container and
 *         scan the base package to find all annotated class
 *         live @Controller, @Service, @RestController
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "it.dg.springexample" })
public class WebSystemConfig {
}
