package assignments.Ass10;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first word: ");
		String s1 = sc.nextLine();
		System.out.println("Enter your second word: ");
		String s2 = sc.nextLine();
		
		System.out.println(coverString(s1,s2));
		System.out.println(coverString2(s1,s2));
	}
	// two possible solutions
	public static String coverString(String s1,String s2) { // Solution-1 short&easy
		return s1.replaceAll(s2, ("[" + s2 + "]"));
	}
	
	public static String coverString2(String s1,String s2) { // Solution-2 with loop
		String result = "";
		if( ! s1.contains(s2)) {
			return "[" + s1 + "]";
		}
		while(s1.contains(s2)) {
			result = result + s1.substring(0,s1.indexOf(s2)) + "[" + s2 + "]";
			s1 = s1.substring(s1.indexOf(s2) + s2.length()); // to take the part after s2 for further checks
		}
		return result += s1; // concatenate the remaining part
		}
		
}
