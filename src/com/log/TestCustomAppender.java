package com.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestCustomAppender {
	static final Logger logger = LogManager.getLogger(TestCustomAppender.class.getName());

	public static void main(String[] args) {
		
		logger.info("Hello World!!!"); 
		logger.debug("Hello World!!!");
		logger.error("Hello World!!!");
		System.out.println("Rohit");
	}
}
