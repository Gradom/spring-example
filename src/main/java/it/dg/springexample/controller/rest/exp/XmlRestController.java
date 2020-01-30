package it.dg.springexample.controller.rest.exp;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.dg.springexample.beans.XmlLoginBean;

@RestController
public class XmlRestController extends AbstractPublicRestController{

	
	@GetMapping("/xmlbean")
	public String xmlBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application-context.xml");
		XmlLoginBean xmlBean = context.getBean("loginBean", XmlLoginBean.class);
	//	GenericApplicationContext context = new GenericApplicationContext();
		//new XmlBeanDefinitionReader(context).loadBeanDefinitions("classpath*:application-context.xml");
	//	context.refresh();
		//XmlLoginBean xmlBean = context.getBean("loginBean", XmlLoginBean.class);
		return xmlBean.getMessage();
	}
}
