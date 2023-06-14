package com.cjc;

import org.apache.log4j.Logger;

public class Demo1
{
	static Logger log=Logger.getLogger(Demo1.class.getName());
	public static void main(String[] args) 
	{
		log.debug("DEBUG");
		log.info("INFO");
		log.warn("WARN");
		log.error("ERROR");
		log.fatal("FATAL");
		
	}

}
