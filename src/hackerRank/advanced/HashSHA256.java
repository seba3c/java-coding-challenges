package hackerRank.advanced;

import java.util.*;
import java.security.*;

/**
 * @link https://www.hackerrank.com/challenges/sha-256/problem
 *
 */
public class HashSHA256 {

	private static String bytesToHex(byte[] hash) {
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < hash.length; i++) {
			String hex = Integer.toHexString(0xff & hash[i]);
			if (hex.length() == 1)
				hexString.append('0');
			hexString.append(hex);
		}
		return hexString.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		in.close();
		try {

			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(input.getBytes());
			String answer = new String(bytesToHex(hash));
			System.out.println(answer);
		} catch (NoSuchAlgorithmException e) {

		}
	}
}
