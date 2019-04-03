package ashwin.manur.APCSA.hw.Chapter9;

public class Exercise3 {
	public static void swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
	}
	public static void main(String[] args) {
		int[] temp = {1, 2, 4};
		for(int i : temp) {
			System.out.println(i);
		}
		swap(temp);
		for(int i : temp) {
			System.out.println(i);
		}

		
	}
}
