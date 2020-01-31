package it.dg.springexample.controller.rest.exp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.dg.springexample.beans.collaborators.RequestBeanInSingletonBean;
import it.dg.springexample.beans.lazy.LazyBean;
import it.dg.springexample.beans.nonstaticfactory.NonStaticFactoryBean;
import it.dg.springexample.beans.request.RequestSopedBean;
import it.dg.springexample.beans.session.SessionScopedBean;
import it.dg.springexample.beans.standard.XmlLoginBean;
import it.dg.springexample.beans.staticfactory.StaticFactoryBean;

@RestController
public class XmlRestController extends AbstractPublicRestController {

	private ApplicationContext context;

	@Autowired
	public XmlRestController(ApplicationContext context) {
		this.context = context;
	}

	/**
	 * Method which retrieve a bean from xml metadata configuration and return a
	 * simple message
	 * 
	 * @return
	 */
	@GetMapping("/xmlbean")
	public String xmlBean() {
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
		NonStaticFactoryBean xmlBeanOne = context.getBean("nonStaticFBOne", NonStaticFactoryBean.class);
		NonStaticFactoryBean xmlBeanTwo = context.getBean("nonStaticFBTwo", NonStaticFactoryBean.class);
		return xmlBeanOne.completeMessage().concat("</br> ").concat(xmlBeanTwo.completeMessage());
	}

	/**
	 * Method to load lazy bean
	 */
	@GetMapping("/lazyBean")
	public void lazyBean() {
		context.getBean("lazyBean", LazyBean.class);
	}

	/**
	 * Method to load request bean
	 */
	@GetMapping("/requestBean")
	public void requestBean() {
		RequestSopedBean b = context.getBean("httpRequestBean", RequestSopedBean.class);
		System.out.println(b);
	}

	/**
	 * Method to load session bean
	 */
	@GetMapping("/sessionBean")
	public String sessionBean() {
		SessionScopedBean b = context.getBean("sessionBean", SessionScopedBean.class);
		System.out.println(b);
		b.setState(b.toString());
		return "Session bean state = " + b.getState();
	}

	/**
	 * Method to load collaborator bean
	 */
	@GetMapping("/collaboratorBean")
	public String collaboratorBean() {
		RequestBeanInSingletonBean b = context.getBean("collaboratorB", RequestBeanInSingletonBean.class);
		b.setState("State is = " + Math.random());
		System.out.println(b);
		return "Bean state = " + b.getState();
	}
}
