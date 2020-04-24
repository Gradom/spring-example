package it.dg.springexample.beans.session;

public class SessionScopedBean {

	private String state = "initial";

	public SessionScopedBean() {
		System.out.println(" SessionScopedBean ----------> session http scoped bean created");

	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
