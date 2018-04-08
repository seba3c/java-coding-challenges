package hackerRank.crackingCodingInterview;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 
 * @link https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
 *
 */
public class Anagrams {

	public static int numberNeeded(String first, String second) {
		Set<Character> s1 = first.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
		Set<Character> s2 = first.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
		
		Set<Character> intersection = s1.retainAll(s2);
		
		s1.removeAll(intersection)
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}

}
