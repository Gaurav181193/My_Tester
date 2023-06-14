package com.cjc.Day19;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo 
{
	@BeforeClass
	public static void m1()  
	{
		System.out.println("Before class");
	}
	@AfterClass
	public static void m2()  
	{
		System.out.println("After class");
	}
	@Before
	public void m3()  
	{
		System.out.println("Before");
	}
	@After
	public void m4()  
	{
		System.out.println("After");
	}
	@Test
	public void m5()  
	{
		System.out.println("Test m5");
	}
	@Test
	public void m6()  
	{
		System.out.println("Test m6");
	}
	

}
