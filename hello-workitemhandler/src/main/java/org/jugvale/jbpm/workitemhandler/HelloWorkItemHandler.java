package org.jugvale.jbpm.workitemhandler;

import org.drools.core.process.instance.WorkItemHandler;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemManager;

public class HelloWorkItemHandler implements WorkItemHandler {

	public void abortWorkItem(WorkItem wi, WorkItemManager wim) {
		System.out.println("Oh no, my item aborted..");

	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		System.out.println("Hello World!");
	}

}