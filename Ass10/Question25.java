package assignments.Ass10;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first word: ");
		String s1 = sc.next();
		System.out.println("Enter your second word: ");
		String s2 = sc.next();
		
		mergeStrings(s1,s2);
	}
	public static void mergeStrings(String s1, String s2) {
		String result = "";
		int diff = s1.length() - s2.length();
		
		if(diff>=0) {
			for(int i=0;i<s2.length();i++) {
				result = result + s1.charAt(i) + s2.charAt(i); 
			}
			if(diff!=0) {
				result = result + s1.substring(s1.length()- diff);//to concatenate the remaining part
			}
		}else {
			for(int i=0;i<s1.length();i++) {
				result = result + s1.charAt(i) + s2.charAt(i); 
			}
			result = result + s2.substring(s2.length()+ diff);//to concatenate the remaining part (+diff because diff is negative)
		}
		System.out.println(result);
	}

}
