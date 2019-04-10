package ashwin.manur.APCSA.hw.Chapter9;

public class RandomIndex {
	public static void pickIndex(int[] nums) {
		int ind = (int)(Math.random() * nums.length);
		System.out.print(nums[ind]);
	}
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
		pickIndex(nums);
	}
}