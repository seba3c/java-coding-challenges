package hackerRank.numbers;

import java.math.BigDecimal;
import java.util.*;

/**
 * @link https://www.hackerrank.com/challenges/java-bigdecimal/problem
 */
class BigDecimalSol {

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();

		s = Arrays.stream(s).filter(Objects::nonNull).toArray(String[]::new);

		Arrays.sort(s, 0, s.length, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				BigDecimal bo1 = new BigDecimal(o1);
				BigDecimal bo2 = new BigDecimal(o2);
				return bo2.compareTo(bo1);
			}
		});

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}
