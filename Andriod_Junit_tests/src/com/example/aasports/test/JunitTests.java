package com.example.aasports.test;

import android.test.ActivityInstrumentationTestCase2;

import com.example.aasports.MainActivity;
import com.example.aasports.Person;
/**
 * 
 * @author Ask
 *
 */
public class JunitTests extends ActivityInstrumentationTestCase2<MainActivity> {
	Person p1;
	Person p2; 
	
	public JunitTests(){
		super(MainActivity.class);
	}
	/**
	 * 
	 */
	@Override
	public void setUp() throws Exception{
		super.setUp();
		p1 = new Person();
	}
	/**
	 * 
	 */
	public void testPerson(){
		Person p2 = new Person(1, 2, 3, 4, 5, "Alexander", "Ask");
		
		p1.setTodaysSteps(1);
		p1.setMonthsStepss(2);
		p1.setKcal(3);
		p1.setTodaysDistance(4);
		p1.setMonthsDistance(5);
		p1.setFnames("Alexander");
		p1.setSname("Ask");
		
		assertEquals(p1.getTodaysSteps(), p2.getTodaysSteps()); 
		assertEquals(p1.getMonthsSteps(), p2.getMonthsSteps());
		assertEquals(p1.getKcal(), p2.getKcal());
		assertEquals(p1.getTodaysDistance(), p2.getTodaysDistance());
		assertEquals(p1.getMonthsDistance(), p2.getMonthsDistance());
		assertEquals(p1.getFname(), p2.getFname());
		assertEquals(p1.getSname(), p2.getSname());
	}
	
}

