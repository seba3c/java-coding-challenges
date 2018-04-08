package hackerRank.dataStructures;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @link https://www.hackerrank.com/challenges/java-stack/problem
 */
class JavaStack {

	static Set<Character> OPEN_SYMBOLS = Stream.of('(', '[', '{').collect(Collectors.toCollection(HashSet::new));
	static Set<Character> CLOSE_SYMBOLS = Stream.of(')', ']', '}').collect(Collectors.toCollection(HashSet::new));
	
	private static boolean isBalanced(String s) {
		char[] chars = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(Character c: chars) {
			if (OPEN_SYMBOLS.contains(c)) {
				stack.push(c);
			} else if (CLOSE_SYMBOLS.contains(c)) {
				if (stack.isEmpty()) {
					return false;
				} else {
					Character e = stack.pop();
					boolean mismatch = (c == ')' && e != '(') || (c == ']' && e != '[') || (c == '}' && e != '{');
					if (mismatch)
						return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.next();
			System.out.println(isBalanced(input));
		}
		sc.close();
	}
}