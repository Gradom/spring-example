package it.dg.springexample.beans.standard;

public class XmlLoginBean {

	private String message = "Default welcome message";

	public XmlLoginBean() {
	}

	public XmlLoginBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
