package com.test.product;

import org.apache.camel.spring.Main;

public class MainExample {

	public static void main(String[] args) throws Exception {
		Main main = new Main();
		main.setApplicationContextUri("META-INF/spring/CamelContext.xml");
		main.start();
	}
}
