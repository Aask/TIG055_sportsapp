package com.example.aasports.test;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.aasports.MainActivity;
import com.example.aasports.Person;
import com.example.aasports.R;
import com.example.aasports.SensorManagement;
/**
 * 
 * @author Alexander Ask
 *
 */
public class JunitTests extends ActivityInstrumentationTestCase2<MainActivity> {
	private Person p1;
	private Person p2;
	private MainActivity ma; 
	
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
		
		//Context c = getInstrumentation().getTargetContext();
		//Intent intent = new Intent(c, MainActivity.class);
		//c.startActivity(intent);
			  
		//ma = getActivity();	    
		//ma.getLayoutInflater().inflate(com.example.aasports.R.layout.fragment_main, null);
	}

	/**
	 * 
	 */
	
	public void testPerson(){
		
		Person p2 = new Person(1,"Alexander", "Ask", 80, 83, 0, 0, 0, 0, 0, 0);
		p1.setFnames("Alexander");
		p1.setSname("Ask");
		
		p1.setWeight(80);
		p1.setHeight(183);
		p1.setGender(0);
		
		p1.setTodaysSteps(0);
		p1.setMonthsSteps(0);
		p1.setKcal(0);
		p1.setTodaysDistance(0);
		p1.setMonthsDistance(0);
		
		assertEquals(p1.getFname(), p2.getFname());
		assertEquals(p1.getSname(), p2.getSname());
		assertEquals(p1.getHeight(), p2.getHeight());
		assertEquals(p1.getWeight(), p2.getWeight());
		assertEquals(p1.getGender(), p2.getGender());
		
		assertEquals(p1.getTodaysSteps(), p2.getTodaysSteps()); 
		assertEquals(p1.getMonthsSteps(), p2.getMonthsSteps());
		assertEquals(p1.getKcal(), p2.getKcal());
		assertEquals(p1.getTodaysDistance(), p2.getTodaysDistance());
		assertEquals(p1.getMonthsDistance(), p2.getMonthsDistance());
		
	}
	

	public void testSensor() {
		//ma.runOnUiThread(
			//new Runnable(){
				//public void run(){
					//TextView tw = (TextView) ma.findViewById(R.id.stepsTW); 
					//assertEquals(tw.getText(), "0");
					
					// in future use get steps from db aswell 
			//}
		//}); 

	}
	
}

