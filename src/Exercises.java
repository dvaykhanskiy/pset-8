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
		// write your code here

		return -1;		// default return value to ensure compilation
	}

	public String[] middle(String[] values) {
		// write your code here

		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
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
