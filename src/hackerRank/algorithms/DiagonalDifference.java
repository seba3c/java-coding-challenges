package hackerRank.algorithms;

import java.io.IOException;
import java.util.Scanner;

/**
 * @link https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {

	/*
	 * Complete the diagonalDifference function below.
	 */
	static int diagonalDifference(int[][] a, int n) {
		int primaryDiagonal = 0;
		int secondaryDiagonal = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				if (i == j) {
					primaryDiagonal += a[i][j];
				}
				if (i + j + 1 == n) {
					secondaryDiagonal += a[i][j];
				}
			}
		return Math.abs(primaryDiagonal - secondaryDiagonal);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[][] a = new int[n][n];

		for (int aRowItr = 0; aRowItr < n; aRowItr++) {
			String[] aRowItems = scan.nextLine().split(" ");

			for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
				int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
				a[aRowItr][aColumnItr] = aItem;
			}
		}

		int result = diagonalDifference(a, n);

		System.out.println(result);

		//bw.write(String.valueOf(result));
		//bw.newLine();

		//bw.close();
	}
}
