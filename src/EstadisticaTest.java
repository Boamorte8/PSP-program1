import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class EstadisticaTest {

	@Test
	public void statisticTestObject() {
		Statistic testObject = new Statistic();
		assertNotNull(testObject);
	}
	
	@Test
	public void getMeanTest(){
		Statistic statistic = new Statistic();
		LinkedList<Float> numberList = new LinkedList<Float>();
		String numbers = "160,591,114,229,230,270,128,1657,624,1503";
		numberList = statistic.getListFromString(numbers);
		float mean = statistic.getMean(numberList);
		assertEquals("Is not the media expected. ", 550.6, mean, 0.1);
	}
	

@Test
	public void getStandarDeviation(){
		Statistic statistic = new Statistic();
		LinkedList<Float> numberList = new LinkedList<Float>();
		String numbers = "160,591,114,229,230,270,128,1657,624,1503";
		numberList = statistic.getListFromString(numbers);
		float standarDeviation = statistic.getStandarDeviation(numberList);
		assertEquals("Its not the expected standar deviation", 542.67, standarDeviation, 0.01);
	}
	
@Test
	public void getVariance(){
		Statistic statistic = new Statistic();
		LinkedList<Float> numberList = new LinkedList<Float>();
		String numbers = "160,591,114,229,230,270,128,1657,624,1503";
		numberList = statistic.getListFromString(numbers);
		float variance  = statistic.getVariance(numberList);
		assertEquals("Its not the expected variance", 294493.24, variance, 0.1);
	}
	

	

}
