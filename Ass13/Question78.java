package assignments.Ass13;

import java.util.Arrays;

public class Question78 {

	public static void main(String[] args) {
		
		String str1 = "apple", str2 = "Ab,c,de!$", str3 = "hello world";
		System.out.println(reverseVowels(str1));
		System.out.println(reverseVowels(str2));
		System.out.println(reverseVowels(str3));
	}
	public static String reverseVowels(String str) {
		String vowels = "", last = "";
		String[] arr = str.split("");
		
		for(int i=0;i<arr.length;i++) {
			if("aeiou".contains(arr[i].toLowerCase())) {
				vowels += arr[i];
			}
		}
		
		int j = vowels.length()-1;
		for(int i=0;i<arr.length;i++) {
			if("aeiou".contains(arr[i].toLowerCase())) {
				last += vowels.charAt(j);
				j--;
			}else {
				last += arr[i];
			}
		}
		return last;
	}
}
