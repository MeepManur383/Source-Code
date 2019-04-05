package ashwin.manur.APCSA.hw.Chapter9;

public class Exercise24 {
	public static void rotateLeft(int[] a) {
		if (a == null || a.length <= 1) {
			return;
		}
		int val1 = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = val1;
	}

	public static void rotateRight(int[] a) {
		if (a == null || a.length <= 1) {
			return;
		}
		int finVal = a[a.length - 1];
		for (int i = a.length - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = finVal;
	}

	public static void rotate(int[] a, int d) {
		// reset d to d % a.length to run the loop the least num of times
		if (a == null || a.length == 0 || d == 0) {
			return;
		}
		while (d > 0) {
			rotateRight(a);
			d--;
		}

		while (d < 0) {
			rotateLeft(a);
			d++;
		}

	}

	public static void printArr(int[] arr) {
		for (int ival : arr) {
			System.out.print(ival);
		}
		System.out.println();

	}

	public static void main(String[] args) {
		int[] rotateLMe = { 1, 2, 3, 4 };
		rotateLeft(rotateLMe);
		printArr(rotateLMe);
		int[] rotateRMe = { 1, 2, 3, 4 };
		rotateRight(rotateRMe);
		printArr(rotateRMe);
		int[] rotate = { 1, 2, 3, 4 };
		rotate(rotate, 1);
		printArr(rotate);
		String str = "abcdef";
		str = str.substring(1, 2);
		System.out.print(str);

	}
}
