package hackerRank.crackingCodingInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @link https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
 *
 */
public class Anagrams {

	private static Map<Character, Integer> string2mapCharCount(String s) {
		Map<Character, Integer> chars = new HashMap<Character, Integer>();
		for (Character c : s.toCharArray()) {
			chars.merge(c, 1, Integer::sum);
		}
		return chars;
	}

	public static int numberNeeded(String first, String second) {
		Map<Character, Integer> chars1 = string2mapCharCount(first);
		Map<Character, Integer> chars2 = string2mapCharCount(second);
		// new map with the abs diff for each entry in both maps
		Map<Character, Integer> diffs = new HashMap<Character, Integer>(chars1);
		for (Map.Entry<Character, Integer> e : chars2.entrySet()) {
		    diffs.merge(e.getKey(), e.getValue(), (o, n) -> Math.abs(o - n));
		}
		// the number of chars to delete is the sum of all values in diffs map
		return diffs.values().stream().mapToInt(Number::intValue).sum();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
		in.close();
	}

}
