package it.dg.springexample.beans.staticfactory;

public class StaticFactoryBean {

	private static StaticFactoryBean instance = new StaticFactoryBean();

	public StaticFactoryBean() {
	}

	public static StaticFactoryBean getInstance() {
		System.out.println(" StaticFactoryBean ------> invoked creating instance ");
		return instance;
	}
}
