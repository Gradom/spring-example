package it.dg.springexample.beans.staticfactory;

public class StaticFactoryBean {

	private static StaticFactoryBean instance = new StaticFactoryBean();
	private String state = "state not initialized";
	private static String message = "Message not initialized";

	private StaticFactoryBean() {
		this.state = "state constructed";
	}

	public static StaticFactoryBean getInstance() {
		System.out.println(" StaticFactoryBean ------> invoked creating instance ");
		message = "message constructed";
		return instance;
	}

	public static String getMessage() {
		return message;
	}

	public String getState() {
		return state;
	}

}
