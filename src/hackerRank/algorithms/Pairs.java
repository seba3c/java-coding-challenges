package hackerRank.algorithms;

import java.util.Scanner;

/**
 * @link https://www.hackerrank.com/challenges/pairs/problem
 */
public class Pairs {

	//Timeout sol
	static int pairs(int k, int[] arr) {
		//TODO: concurrency
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			//TODO: second iteration in a thread
			for (int j = i + 1; j < arr.length; j++) {
				if (Math.abs(arr[i] - arr[j]) == k) {
					count++;
				}
			}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = pairs(k, arr);
		System.out.println(result);
		in.close();
	}
}
