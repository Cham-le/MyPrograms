package smooth_sailing;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.javafx.collections.ImmutableObservableList;

import jdk.nashorn.internal.ir.annotations.Immutable;
import sun.security.x509.IssuingDistributionPointExtension;

public class ReverseInPeranthese {
	String reverseInParentheses(String inputString) {
		StringBuilder temp = new StringBuilder(inputString);
		int start, end;
		while (temp.indexOf("(") != -1) {
			start = temp.lastIndexOf("(");
			end = temp.indexOf(")", start);
			temp.replace(start, end + 1, new StringBuilder(temp.substring(start + 1, end)).reverse().toString());
		}
		return temp.toString();
	}

	String[] addBorder(String[] picture) {
		String[] a = new String[picture.length + 2];
		int i = 1;
		for (String s : picture) {
			String temp = "*" + s + "*";
			a[i++] = temp;
		}
		a[0] = a[i] = a[1].replace(".", "*");
		return a;
	}

	boolean areSimilar(int[] a, int[] b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				count++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == b[j]) {
						int temp = b[i];
						b[i] = b[j];
						b[j] = temp;
					}
				}
			}

		}
		return count < 2;
	}

	static boolean isIPv4Address(String inputString) {
		Pattern pattern = Pattern.compile("[a-z]");
		Matcher matcher = pattern.matcher(inputString);
		if (matcher.find())
			return false;
		String[] arr = inputString.split("\\.");
		if (arr.length != 4)
			return false;
		for (String s : arr) {
			if (s.length() > 3 || s.equals("") || Integer.parseInt(s) > 255 || Integer.parseInt(s) < 0) {
				return false;
			}
		}
		return true;
	}

	static int avoidObstacles(int[] inputArray) {
		int step = 2;
		int len = inputArray.length;
		boolean check = true;
		while (check) {
			check = false;
			for (int i = 0; i < len; i++) {
				if (inputArray[i] % step == 0) {
					check = true;
					step++;
					break;
				}
			}
		}
		return step;
	}

	public static void main(String[] args) {
		int[] a = { 5, 8, 9, 13, 14 };
		System.out.println(avoidObstacles(a));
	}
}
