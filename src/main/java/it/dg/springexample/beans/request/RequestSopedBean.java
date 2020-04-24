package it.dg.springexample.beans.request;

public class RequestSopedBean {

	private String state = "empty";

	public RequestSopedBean() {
		System.out.println(" RequestSopedBean ----------> request http scoped bean created");
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
