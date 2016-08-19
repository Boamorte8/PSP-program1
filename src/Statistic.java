import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Statistic {
	
	Scanner scanner = new Scanner(System.in);
	
	//After
	//Before
	//Setup
	//Tear down
	
	public static void main (String arg[]){
		Statistic statistic = new Statistic();
		statistic.getNumbers();
	}

	public float getMean() {
		return 0;
	}
	
	public float getMean( LinkedList<Float> numberList) {
		float sum = (float) 0.0;
		float mean = (float) 0.0;
		for (Float number : numberList) {
			sum += number;
		}
		mean = sum/numberList.size();
		return mean;
	}

	public float getStandarDeviation(LinkedList<Float> numberList) {
		float standarDeviation = 0;
		float variance = getVariance(numberList);
		standarDeviation = (float) Math.sqrt(variance);
		return standarDeviation;
	}

	public float getVariance(LinkedList<Float> numberList) {
		float mean = getMean(numberList);
		float variance = 0;
		for (Float number : numberList) {
			variance += Math.pow(number-mean, 2);
		}
		variance = variance/(numberList.size()-1);
		return variance;
	}
	
	public void getNumbers(){
	    System.out.print("Ingrese los numeros separados por ',' (Ejm. 4,5,8,7) : \n");
	    String input = scanner.nextLine();
	    System.out.println(" \nLos numeros ingresados son: \n" + input);
	    System.out.println("----------------------------------------\n");
	    scanner.close();
	    LinkedList<Float> numberList = getListFromString(input);
	    float mean = getMean(numberList);
	    float standarDeviation = getStandarDeviation(numberList);
	    System.out.println("La media es: "+ mean);
	    System.out.println("La Desviación Estandar es: "+ standarDeviation);
	    
	}
	
	public LinkedList<Float> getListFromString(String stringList){
		LinkedList<Float> list = new LinkedList<Float>();
		String[] floatString = stringList.split(",");
		for (int i = 0; i < floatString.length; i++) {
			list.add(Float.parseFloat(floatString[i]));
		}
		return list;
	}
	
	public void printList(LinkedList<Float> list){
		for (Float float1 : list) {
			System.out.print(float1+ " - ");	
		}
	}
		
	

}
