package it.dg.springexample.beans.nonstaticfactory;

public class NonStaticFactoryBean {

	private static NonStaticFactoryBean instance = new NonStaticFactoryBean();
	private String firstMessage = "Message not initialized";
	private String secondMessage = "Message not initialized";

	public NonStaticFactoryBean() {
		System.out.println(" NonStaticFactoryBean ------->Bean created");
	}

	public NonStaticFactoryBean firstFactoryMethod() {
		instance.firstMessage = "First message initialized";
		return instance;

	}

	public NonStaticFactoryBean secondFactoryMethod() {
		instance.secondMessage = "Second message initialized";
		return instance;
	}

	public String completeMessage() {
		return instance.firstMessage.concat(" ").concat(instance.secondMessage);
	}

}
