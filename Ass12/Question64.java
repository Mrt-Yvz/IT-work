package assignments.Ass12;

import java.util.ArrayList;

public class Question64 {

	public static void main(String[] args) {
		
		ArrayList<String> wordList1 = new ArrayList<>();
		ArrayList<String> wordList2 = new ArrayList<>();
		String str1 ="a b c d e f g";
		String str2 ="h i j k l m n";
		
		for(int i=0;i<str1.split(" ").length;i++) {
			wordList1.add(str1.split(" ")[i]);
		}
		for(int i=0;i<str2.split(" ").length;i++) {
			wordList2.add(str2.split(" ")[i]);
		}
		
		System.out.println("wordList1 ==>" + wordList1);
		System.out.println("wordList2 ==>" + wordList2);
		System.out.println("Combined ==> " + combineAL(wordList1,wordList2));
		
	}
	public static ArrayList<String> combineAL(ArrayList<String> wordList1,ArrayList<String> wordList2){
		
		wordList1.addAll(wordList2);
		return wordList1;
	}
}
