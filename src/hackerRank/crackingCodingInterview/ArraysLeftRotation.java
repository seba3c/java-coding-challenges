package hackerRank.crackingCodingInterview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @link https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */
public class ArraysLeftRotation {

	private static int[] leftRotate(int[] a, int k) {
		int[] r = Arrays.copyOf(a, a.length);
		for (int j = 1; j <= k; j++) {
			int top = r[0];
			for (int i = 0; i < r.length - 1; i++) {
				r[i] = r[i + 1];
			}
			r[r.length - 1] = top;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		in.close();

		int[] aRotated = leftRotate(a, k);

		// System.out.println(Arrays.toString(a));
		String ans = Arrays.toString(aRotated).replaceAll("[\\[\\],]*", "");
		System.out.println(ans);
	}
}
