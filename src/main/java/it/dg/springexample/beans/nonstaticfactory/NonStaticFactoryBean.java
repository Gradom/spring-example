package it.dg.springexample.beans.nonstaticfactory;

public class NonStaticFactoryBean {

	private String firstMessage = "Message not initialized";
	private String secondMessage = "Message not initialized";
	private String threeMessage = "Message not initialized";

	public NonStaticFactoryBean() {
	}

	public void firstFactoryMethod() {
		setFirstMessage("First message initialized");

	}

	public void secondFactoryMethod() {
		setSecondMessage("Second message initialized");
	}

	public void threeFactoryMethod() {
	}

	public String completeMessage() {
		return getFirstMessage().concat(" ").concat(getSecondMessage()).concat(" ").concat(getThreeMessage());
	}

	public void setFirstMessage(String firstMessage) {
		this.firstMessage = firstMessage;
	}

	public void setSecondMessage(String secondMessage) {
		this.secondMessage = secondMessage;
	}

	public String getFirstMessage() {
		return firstMessage;
	}

	public String getSecondMessage() {
		return secondMessage;
	}

	public String getThreeMessage() {
		return threeMessage;
	}

	public void setThreeMessage(String threeMessage) {
		this.threeMessage = threeMessage;
	}

}
