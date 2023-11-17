package com.infinite.log4j;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Log4j {
	private static final Logger logger = Logger.getLogger(Log4j.class);
	{
		logger.info("Unnamed Block");
	}
	public static void display() {
		logger.info("hi from DIsplay");
	}
	public static void displaynonstatic() {
		try {
			int a = 1 / 0;
		} catch (Exception e) {
			logger.error("hi from nonDIsplay");
		}
	}
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Hi Hello World");
		logger.warn("Plz dont use it");
		logger.error("Heap Error Occured");
		logger.fatal("Error occured");
	}
}