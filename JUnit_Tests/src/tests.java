import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.example.aasports.Person;

public class tests {
	
	Person p1; 
	@Before
	public void setup() {
		p1 = new Person();
	}

	@Test
	public void PersonTest(){
		Person p2 = new Person(1, 2, 3, 4, 5, "Alexander", "Ask");
		
		p1.setTodaysSteps(1);
		p1.setMonthsStepss(2);
		p1.setKcal(3);
		p1.setTodaysDistance(4);
		p1.setMonthsDistance(5);
		p1.setFnames("Alexander");
		p1.setSname("Ask");
		
		Assert.assertEquals(p1.getTodaysSteps(), p2.getTodaysSteps()); 
		Assert.assertEquals(p1.getMonthsSteps(), p2.getMonthsSteps());
		Assert.assertEquals(p1.getKcal(), p2.getKcal());
		Assert.assertEquals(p1.getTodaysDistance(), p2.getTodaysDistance());
		Assert.assertEquals(p1.getMonthsDistance(), p2.getMonthsDistance());
		Assert.assertEquals(p1.getFname(), p2.getFname());
		Assert.assertEquals(p1.getSname(), p2.getSname());
		
	}
}