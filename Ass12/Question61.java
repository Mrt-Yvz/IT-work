package assignments.Ass12;

import java.util.ArrayList;

public class Question61 {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		words.add("abc");
		words.add("def");
		words.add("ghi");
		System.out.println(gitGud(words));
	}
	public static ArrayList<String> gitGud(ArrayList<String> arl){
		arl.set(0, "git");
		arl.set(2, "gud");
		return arl;
	}
}
