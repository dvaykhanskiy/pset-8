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
		String newString = new String[n * 2];
		if (values == null || values.length < n || n <= 0) {
			return emptyString;
		} else {
			for (int i = 0; i < n; i++) {
				newString[i] = values[i];
			}

			for (int i = values.length;  i > (values.length - n); i--) {
				
			}
		}

		return null;	// default return value to ensure compilation
	}

	public int difference(int[] numbers) {
		// write your code here

		return -1;		// default return value to ensure compilation
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
