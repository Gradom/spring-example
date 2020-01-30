package it.dg.springexample.controller.rest.exp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.dg.springexample.beans.standard.XmlLoginBean;

@RestController
public class XmlRestController extends AbstractPublicRestController {

	@GetMapping("/xmlbean")
	public String xmlBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application-context.xml");
		XmlLoginBean xmlBean = context.getBean("loginBean", XmlLoginBean.class);
		return xmlBean.getMessage();
	}

	@GetMapping("/xmlUserbean")
	public String xmlUserbean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application-context.xml");
		XmlLoginBean xmlBean = context.getBean("loginBean", XmlLoginBean.class);
		return xmlBean.getMessage();
	}

}
