package com.revature.logback;

import org.apache.log4j.Logger;

public class Logback {
	static Logger logger =Logger.getLogger(Logback.class); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("my first Logging program");
		logger.debug("first logg");
		logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");

	}

}
