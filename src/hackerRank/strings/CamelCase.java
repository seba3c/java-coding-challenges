package hackerRank.strings;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Scanner;

/**
 * @link https://www.hackerrank.com/challenges/camelcase/problem
 */
public class CamelCase {

	static int camelCase(String s) {
		int count = 0;
		if (s == null || s.trim() == "") {
			return count;
		}
		if (Character.isLowerCase(s.charAt(0))) {
			count += 1;
		}
		CharacterIterator it = new StringCharacterIterator(s);
		while (it.current() != CharacterIterator.DONE) {
			Character c = it.next();
			if (Character.isUpperCase(c)) {
				count += 1;
			}
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelCase(s);
        System.out.println(result);
        in.close();
    }

}
