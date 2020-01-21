public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		} else {
			if ((a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1])) {
				return true;
			} else {
				return false;
			}
		}
	}

	public String[] endsMeet(String[] values, int n) {
		String emptyString[] = new String[0];
		if (values == null || n < 0 || values.length < n) {
			return emptyString;
		}

		String newString[] = new String[n * 2];

		for (int i = 0; i < n; i++) {
			newString[i] = values[i];
		}

		int backCount = n;
		for (int j = n; j < n * 2; j++) {
			newString[j] = values[values.length - backCount];
			backCount--;
		}

		return newString;
	}

	public int difference(int[] numbers) {
		if (numbers == null || numbers.length < 1) {
			return -1;
		}
		int min = numbers[0];
		int max = numbers[0];

		for (int i : numbers) {
			if (i < min) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
		}

		return max - min;
	}

	public double biggest(double[] numbers) {
		if (numbers == null || numbers.length % 2 == 0 || numbers.length < 3) {
			return -1;
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				return -1;
			}
		}

		double big = numbers[0];
		if (big < numbers[numbers.length - 1]) {
			big = numbers[numbers.length - 1];
		}
		if (big < numbers[((numbers.length + 1) / 2) - 1]) {
			big = numbers[((numbers.length + 1) / 2) - 1];
		}

		return big;		// default return value to ensure compilation
	}

	public String[] middle(String[] values) {
		String emptyString[] = new String[0];
		if (values == null  || values.length % 2 == 0 || values.length < 3) {
			return emptyString;
		}
		for (String i : values) {
			if (i == null) {
				return emptyString;
			}
		}

		String newString[] = new String[3];
		for (int i = 0; i < 3; i++) {
			newString[i] = values[((values.length + 1) / 2) - 2 + i];
		}


		return newString;
	}

	public boolean increasing(int[] numbers) {
		if (numbers ==  null || numbers.length < 3) {
			return false;
		}

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[i - 1] && numbers[i] < numbers[i + 1]) {
				return true;
			}
		}

		return false;
	}

	public boolean everywhere(int[] numbers, int x) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(String[] values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
