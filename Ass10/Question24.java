package assignments.Ass10;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text: ");
		String textJava = sc.nextLine();
		String textPython = textJava;
		int counterJava=0,counterPython=0;
		boolean result = true;
		
		//two solutions
		//Solution-1 fast&easy
		String text = "-" + textJava + "-";// iot assure there remains at least one char on each side after split
		System.out.println(text.split("java").length == text.split("python").length);
		
		//Solution-2 with loop
		while(textJava.contains("java") || textPython.contains("python")){
			if(textJava.contains("java")) {
				counterJava++;
				textJava = textJava.substring(textJava.indexOf("java")+4);
			}
			if(textPython.contains("python")) {
				counterPython++;
				textPython = textPython.substring(textPython.indexOf("python")+6);
			}
			if(counterJava != counterPython) {
				result = false;
				break;
			}
		}
		System.out.println(result);
	}

}
