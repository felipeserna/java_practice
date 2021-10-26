import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Solution a = new Solution();
		int[] nums = new int[]{2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(a.twoSum(nums, target)));

		int[] nums_1 = new int[]{3, 2, 4};
		int target_1 = 6;
		System.out.println(Arrays.toString(a.twoSum(nums_1, target_1)));

		int[] nums_2 = new int[]{3, 3};
		int target_2 = 6;
		System.out.println(Arrays.toString(a.twoSum(nums_2, target_2)));
	}
}
