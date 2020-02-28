package assignments.Ass13;

import java.util.ArrayList;

public class Question75 {

	public static void main(String[] args) {
		
	ArrayList<String> arr = new ArrayList<>();
	arr.add("one apple");
	arr.add("two orange");
	arr.add("four banana");
	String word = "four";
	search(arr,word);
	}
	
	public static String search(ArrayList<String> arl, String word) {
		String dummy = "";
		int counter = 0;
		for(String each: arl){
			if(each.contains(word)) {
				System.out.println(each);
				dummy = dummy + " " + each ;
				counter++;
			}
		}
		if(counter == 0) {
			System.out.println("search failed");
		}
		return dummy;
	}
}
