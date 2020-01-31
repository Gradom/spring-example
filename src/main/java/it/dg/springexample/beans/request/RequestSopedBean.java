package it.dg.springexample.beans.request;

import it.dg.springexample.beans.lazy.LazyBean;

public class RequestSopedBean {
	
	private LazyBean lazy;

	public RequestSopedBean() {
		System.out.println(" RequestSopedBean ----------> request http scoped bean created");
	}

	public LazyBean getLazy() {
		return lazy;
	}

	public void setLazy(LazyBean lazy) {
		this.lazy = lazy;
	}

}
