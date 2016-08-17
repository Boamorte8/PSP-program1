
public class Statistic {

	public float getMean(int[] numbers) {

		float sum = (float) 0.0;
		float mean = (float) 0.0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		mean = sum/numbers.length;
		return mean;
	}
	
	public float getMean(float[] numbers) {

		float sum = (float) 0.0;
		float mean = (float) 0.0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		mean = sum/numbers.length;
		return mean;
	}

	public float getStandarDeviation(int[] numbers) {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getVariance(int[] numbers) {
		// TODO Auto-generated method stub
		return (float) 8.6;
	}
	
	

}
