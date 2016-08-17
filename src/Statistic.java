
public class Statistic {

	public float getMean(float[] numbers) {
		float sum = (float) 0.0;
		float mean = (float) 0.0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		mean = sum/numbers.length;
		return mean;
	}
	
	public float getMean(int[] numbers) {
		float[] floatNumbers = castIntArraytoFloatArray(numbers);
		float mean = getMean(floatNumbers);
		return mean;
	}

	public double getStandarDeviation(int[] numbers) {
		float standarDeviation = 0;
		float variance = getVariance(numbers);
		standarDeviation = (float) Math.sqrt(variance);
		return standarDeviation;
	}

	public float getVariance(int[] numbers) {
		float mean = getMean(numbers);
		float variance = 0;
		for (int i = 0; i < numbers.length; i++) {
			variance += Math.pow(numbers[i]-mean, 2);
		}
		variance = variance/numbers.length;
		return variance;
	}
	
	public float[] castIntArraytoFloatArray(int[] array){
		float[] floatNumbers = new float[array.length];
		for (int i = 0; i < array.length; i++) {
			floatNumbers[i] = (float) Float.valueOf(array[i]);
		}
		return floatNumbers;
	}
	

}
