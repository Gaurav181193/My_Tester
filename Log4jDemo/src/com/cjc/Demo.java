package com.cjc;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;


public class Demo 
{
	static Logger log=Logger.getLogger(Demo.class.getName());

	public static void main(String[] args) throws IOException 
	{
//		Layout al=new PatternLayout();
//		Appender ap=new FileAppender(al,"abc.txt");
//		log.addAppender(ap);
//		
		//Layout al=new PatternLayout();
		//Appender ap=new ConsoleAppender(al);
		//log.addAppender(ap);
		log.debug("DEBUG");
		log.info("INFO");
		log.warn("WARN");
		log.error("ERROR");
		log.fatal("FATAL");

	}

}
