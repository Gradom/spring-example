package it.dg.springexample.beans.collaborators;

import it.dg.springexample.beans.request.RequestSopedBean;

public class RequestBeanInSingletonBean {

	private RequestSopedBean httpRequestCBean;

	public RequestBeanInSingletonBean() {
		System.out.println(" RequestBeanInSingletonBean ----------> Collaborator bean created");
	}

	public RequestSopedBean getHttpRequestCBean() {
		return httpRequestCBean;
	}

	public void setHttpRequestCBean(RequestSopedBean httpRequestCBean) {
		this.httpRequestCBean = httpRequestCBean;
	}

	public void setState(String state) {
		this.httpRequestCBean.setState(state);
	}

	public String getState() {
		return this.httpRequestCBean.getState();
	}
}
