package assignments.Ass12;

import java.util.ArrayList;

public class Question65 {

	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<>();
		String targetWord = "c";
		String str1 ="c b c d e c g";
				
		for(int i=0;i<str1.split(" ").length;i++) {		// initializing wordList
			wordList.add(str1.split(" ")[i]);
		}
		
		System.out.println("word list ==> " + wordList);
		System.out.println("target word ==> " + targetWord);
		System.out.println("Final ==> " + removeAll(wordList,targetWord));

	}
	public static ArrayList<String> removeAll(ArrayList<String> wordList,String targetWord){
		for(int i=0;i<wordList.size();i++) {
			if(wordList.get(i).equals(targetWord)) {
				wordList.remove(i);
			}
		}
		return wordList;
	}

}
