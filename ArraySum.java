
public class ArraySum {
	int sum = 0;
	int newsum = 0;
	
	public int sumOfArray (Integer[] a,int index) {
		if (index >= 0) {
			newsum += a[index];
			index--;
			sumOfArray (a, index);
		} else {
			sum = newsum;
			newsum = 0;
		}
		return sum;
	}
}
