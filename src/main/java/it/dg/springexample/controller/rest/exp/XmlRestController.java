package it.dg.springexample.controller.rest.exp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.dg.springexample.beans.nonstaticfactory.NonStaticFactoryBean;
import it.dg.springexample.beans.standard.XmlLoginBean;
import it.dg.springexample.beans.staticfactory.StaticFactoryBean;

@RestController
public class XmlRestController extends AbstractPublicRestController {

	/**
	 * Method which retrieve a bean from xml metadata configuration and return a
	 * simple message
	 * 
	 * @return
	 */
	@GetMapping("/xmlbean")
	public String xmlBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application-context.xml");
		XmlLoginBean xmlBean = context.getBean("loginBean", XmlLoginBean.class);
		return xmlBean.getMessage();
	}

	/**
	 * Method to load a static factory bean
	 * 
	 * @return
	 */
	@GetMapping("/xmlStaticBean")
	public String xmlUserbean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application-context.xml");
		StaticFactoryBean xmlBean = context.getBean("staticFactoryBean", StaticFactoryBean.class);
		return StaticFactoryBean.getMessage().concat("\n " + xmlBean.getState());
	}

	/**
	 * Method to load a NON static factory bean
	 * 
	 * @return
	 */
	@GetMapping("/xmlNonStaticBean")
	public String xmlNonStaticBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application-context.xml");
		NonStaticFactoryBean xmlBeanOne = context.getBean("nonStaticFBOne", NonStaticFactoryBean.class);
		NonStaticFactoryBean xmlBeanTwo = context.getBean("nonStaticFBTwo", NonStaticFactoryBean.class);
		return xmlBeanOne.completeMessage().concat("</br> ").concat(xmlBeanTwo.completeMessage());
	}

	@GetMapping("/lazyBean")
	public void lazyBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application-context.xml");
		// context.getBean("lazyBean", LazyBean.class);
		// context.getBean("nonLazyBean", NonLazyBean.class);
	}

	@GetMapping("/requestScopedBean")
	public void requestScopedBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application-context.xml");
		// context.getBean("lazyBean", LazyBean.class);
		// context.getBean("nonLazyBean", NonLazyBean.class);
	}
}
