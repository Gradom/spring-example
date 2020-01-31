package it.dg.springexample.beans.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class LifeCycleBean {

	public LifeCycleBean() {
		System.out.println(" LifeCycleBean ------->Bean created");
	}

	@PostConstruct
	public final void postConstruct() {
		System.out.println(" LifeCycleBean -------> Post construct method invoked");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println(" LifeCycleBean -------> Pre destroy method invoked");
	}

}
