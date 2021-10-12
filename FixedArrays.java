// Arrays in Java have fixed length.
// You can't add nor remove items.
import java.util.Arrays;

public class FixedArrays {
	public static void main(String[] args) {
		int[] numbers = {4, 9, -3, 8, 7};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		// Multi - dimensional arrays
		int[][][] items = new int[2][2][2];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				for(int k = 0; k < 2; k++) {
					items[i][j][k] = 5;
				}
			}
		}
		System.out.println(Arrays.deepToString(items));

		int [][][] items_2 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
		System.out.println(Arrays.deepToString(items_2));
	}
}
