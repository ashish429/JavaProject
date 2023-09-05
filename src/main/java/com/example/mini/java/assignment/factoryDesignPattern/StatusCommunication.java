package com.example.mini.java.assignment.factoryDesignPattern;

public class StatusCommunication {

	public Status getProcess(String status) {
		if ("success".equalsIgnoreCase(status)) {
			return (Status) new SuccessStatus();
		} else if ("pending".equalsIgnoreCase(status)) {
			return (Status) new PendingStatus();
		} else if ("failure".equalsIgnoreCase(status)) {
			return (Status) new FailureStatus();
		}
		return null;
	}

}
