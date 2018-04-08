package others;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Demo TEST coding challenge.
 */
public class SmallestPositiveInt {

	public static int solution(int[] A) {
		// write your code in Java SE 8
		Integer smallestPositiveInt = 1;
		Integer[] wrappedInts = Arrays.stream(A).boxed().toArray(Integer[]::new);
		Set<Integer> numberSet = new HashSet<Integer>(Arrays.asList(wrappedInts));
		while (numberSet.contains(smallestPositiveInt)) {
			smallestPositiveInt++;
		}
		return smallestPositiveInt;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 6, 4, 1, 2 };
		int ans = SmallestPositiveInt.solution(a);
		System.out.println(ans);
	}

}
