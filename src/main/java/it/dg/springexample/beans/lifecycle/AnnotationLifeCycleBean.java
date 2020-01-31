package it.dg.springexample.beans.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationLifeCycleBean {

	public AnnotationLifeCycleBean() {
		System.out.println(" AnnotationLifeCycleBean ------->Bean created");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println(" AnnotationLifeCycleBean -------> Post construct method invoked");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println(" AnnotationLifeCycleBean -------> Pre destroy method invoked");
	}
}
