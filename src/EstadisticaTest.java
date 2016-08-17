import static org.junit.Assert.*;

import org.junit.Test;

public class EstadisticaTest {

	@Test
	public void statisticTestObject() {
		Statistic testObject = new Statistic();
		assertNotNull(testObject);
	}
	
	@Test
	public void getMediaTest1(){
		Statistic statistic = new Statistic();
		int[] numbers = {13,4,4,3,7};
		float media = statistic.getMedia(numbers);
		assertEquals("Is not the media expected. ", 6.19, media, 0.01);
	}
	
	@Test
	public void getStandarDeviation(){
		Statistic statistic = new Statistic();
		int[] numbers = {7,4,65,35,2,66};
		float standarDeviation  = statistic.getStandarDeviation(numbers);
		assertEquals("Its not the expected standar deviation", 5.66, standarDeviation, 0.01);
	}
	
	@Test
	public void getVariance(){
		Statistic statistic = new Statistic();
		int[] numbers = {7,4,65,35,2,66};
		float variance  = statistic.getVariance(numbers);
		assertEquals("Its not the expected variance", 8.6, variance, 0.01);
	}

}
