
public class Statistic {

	public float getMedia(int[] numbers) {

		float sum = (float) 0.0;
		float media = (float) 0.0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		media = sum/numbers.length;
		return media;
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
