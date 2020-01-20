package sorting.sort;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		int[] intArr = new int [] {11, 1,6,2, 8,9};
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(BubbleSort.sort(intArr)));

	}

}
