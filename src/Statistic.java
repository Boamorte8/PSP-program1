import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Statistic {
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main (String arg[]){

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
	
//	public float getMean(int[] numbers) {
//		float[] floatNumbers = castIntArraytoFloatArray(numbers);
//		float mean = getMean(floatNumbers);
//		return mean;
//	}

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
		
//		for (int i = 0; i < numberList.length; i++) {
//			variance += Math.pow(numberList[i]-mean, 2);
//		}
		variance = variance/numberList.size();
		return variance;
	}
	
//	public float[] castIntArraytoFloatArray(int[] array){
//		float[] floatNumbers = new float[array.length];
//		for (int i = 0; i < array.length; i++) {
//			floatNumbers[i] = (float) Float.valueOf(array[i]);
//		}
//		return floatNumbers;
//	}
	
//	public void createLinkedList(){
//		LinkedList<Float> list = new LinkedList<Float>();
//		list.add(71.1f);
//		list.add(78.1f);
//		Iterator<Float> it = list.iterator();
//		for (Float float1 : list) {
//			System.out.println(float1);	
//		}
//		
//	}
	
	public void getNumbers(){
	    System.out.print("Ingrese los numeros separados por ',' (Ejm. 4,5,8,7) : \n");
	    String input = scanner.nextLine();
	    System.out.println("input : " + input);
	    System.out.println("-----------\n");
	    scanner.close();
	    getListFromString(input);
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
