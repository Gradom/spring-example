package it.dg.springexample.beans.lifecycle;

public class LifeCycleBean {

	public LifeCycleBean() {
		System.out.println(" LifeCycleBean ------->Bean created");
	}

	public void postConstruct() {
		System.out.println(" LifeCycleBean -------> Post construct method invoked");
	}

	public void preDestroy() {
		System.out.println(" LifeCycleBean -------> Pre destroy method invoked");
	}

}
