import static org.junit.Assert.*;

import org.junit.Test;

public class EstadisticaTest {

	@Test
	public void statisticTestObject() {
		Statistic testObject = new Statistic();
		assertNotNull(testObject);
	}
	
	@Test
	public void getMediaTestInts(){
		Statistic statistic = new Statistic();
		int[] numbers = {160,591,114,229,230,270,128,1657,624,1503};
		float mean = statistic.getMean(numbers);
		assertEquals("Is not the media expected. ", 550.6, mean, 0.1);
	}
	
	@Test
	public void getMediaTestFloats(){
		Statistic statistic = new Statistic();
		float[] numbers = {15.0f,69.9f,6.5f,22.4f,28.4f,65.9f,19.4f,198.7f,38.8f,138.2f};
		float mean = statistic.getMean(numbers);
		assertEquals("Is not the media expected. ", 60.32, mean, 0.1);
	}
	

	@Test
	public void getStandarDeviation(){
		Statistic statistic = new Statistic();
		int[] numbers = {160,591,114,229,230,270,128,1657,624,1503};
		double standarDeviation  = statistic.getStandarDeviation(numbers);
		assertEquals("Its not the expected standar deviation", 542.67, standarDeviation, 0.01);
	}
	
	@Test
	public void getVariance(){
		Statistic statistic = new Statistic();
		int[] numbers = {160,591,114,229,230,270,128,1657,624,1503};
		float variance  = statistic.getVariance(numbers);
		assertEquals("Its not the expected variance", 294493.24, variance, 0.1);
	}
	

}
