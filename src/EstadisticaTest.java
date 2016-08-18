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
	public void getMeanTest1(){
		Statistic statistic = new Statistic();
		LinkedList<Float> numberList = new LinkedList<Float>();
		String numbers = "160,591,114,229,230,270,128,1657,624,1503";
		numberList = statistic.getListFromString(numbers);
		float mean = statistic.getMean(numberList);
		assertEquals("Is not the media expected. ", 550.6, mean, 0.1);
	}
	

	@Test
		public void getStandarDeviation1(){
			Statistic statistic = new Statistic();
			LinkedList<Float> numberList = new LinkedList<Float>();
			String numbers = "160,591,114,229,230,270,128,1657,624,1503";
			numberList = statistic.getListFromString(numbers);
			float standarDeviation = statistic.getStandarDeviation(numberList);
			assertEquals("Its not the expected standar deviation", 572.03, standarDeviation, 0.01);
		}
	
	@Test
		public void getVariance1(){
			Statistic statistic = new Statistic();
			LinkedList<Float> numberList = new LinkedList<Float>();
			String numbers = "160,591,114,229,230,270,128,1657,624,1503";
			numberList = statistic.getListFromString(numbers);
			float variance  = statistic.getVariance(numberList);
			assertEquals("Its not the expected variance", 327214.71, variance, 0.1);
		}
	
	@Test
	public void getMeanTest2(){
		Statistic statistic = new Statistic();
		LinkedList<Float> numberList = new LinkedList<Float>();
		String numbers = "15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2";
		
		numberList = statistic.getListFromString(numbers);
		float mean = statistic.getMean(numberList);
		assertEquals("Is not the media expected. ", 60.32, mean, 0.1);
	}
	

	@Test
		public void getStandarDeviation2(){
			Statistic statistic = new Statistic();
			LinkedList<Float> numberList = new LinkedList<Float>();
			String numbers = "15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2";
			numberList = statistic.getListFromString(numbers);
			float standarDeviation = statistic.getStandarDeviation(numberList);
			assertEquals("Its not the expected standar deviation", 62.26, standarDeviation, 0.01);
		}
	
	@Test
		public void getVariance2(){
			Statistic statistic = new Statistic();
			LinkedList<Float> numberList = new LinkedList<Float>();
			String numbers = "15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2";
			numberList = statistic.getListFromString(numbers);
			float variance  = statistic.getVariance(numberList);
			assertEquals("Its not the expected variance", 3875.78, variance, 0.1);
		}
	

	

}
