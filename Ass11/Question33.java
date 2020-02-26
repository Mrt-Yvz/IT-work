package assignments.Ass11;

import java.util.Arrays;

public class Question33 {

	public static void main(String[] args) {
		String[]words = {"hello", "why", "by", "apple" , "note"};
		System.out.println(Arrays.toString(words));
		for(String each : words) {
			System.out.println(each.substring(0,1) + each.substring(each.length()-1));
		}
	}
}
