package it.dg.springexample.beans.startstop;

import org.springframework.context.Lifecycle;

public class StartStopBean implements Lifecycle {

	public void start() {
		System.out.println(" StartStopBean -------> Bean started");
	}

	public void stop() {
		System.out.println(" StartStopBean -------> Bean stopped");
	}

	public boolean isRunning() {
		System.out.println(" StartStopBean -------> Bean is running");
		return true;
	}

}
