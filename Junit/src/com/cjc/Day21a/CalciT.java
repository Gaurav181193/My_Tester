package com.cjc.Day21a;

import org.junit.Assert;
import org.junit.Test;

public class CalciT 
{
	@Test
	public void addTest()
	{
		Calci c=new Calci();
		int acv=c.add(10, 20);
		Assert.assertEquals(30, acv);
	}

}
