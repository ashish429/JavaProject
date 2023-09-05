package com.example.mini.java.assignment.factoryDesignPattern;

import java.util.ArrayList;
import java.util.List;

import com.example.mini.java.assignment.model.Entity;

public class FactoryDesignPattern {
	public static void main(String[] args) {
		List<Entity> entity = entityList();
		Status processor;
		StatusCommunication factory = new StatusCommunication();
		for (Entity m : entity) {
			if(m==null)
			{
				return;
			}
			processor = factory.getProcess(m.getStatus());
			processor.process(m);
		}
		
	}

	private static List<Entity> entityList() {
		List<Entity> message = new ArrayList<>();

		Entity m1 = new Entity(12233300011001, 123456789, "success",
				3545,"2000-08-12");
		Entity m2 = new Entity("12233300011020", "123456787", "pending",
				"5432","20-04-22");
		Entity m3 = new Entity("12233300011004", "123456785", "failure",
				"54323","2019-11-17");
		Entity m4 = new Entity("12233300011005", "123456746", "success",
				"7865","2012-12-19");
		Entity m5 = new Entity("12233300011006", "433456789", "pending",
				"87654","2022-05-10");

		message.add(m1);
		message.add(m2);
		message.add(m3);
		message.add(m4);
		message.add(m5);
		return message;
	}

}

