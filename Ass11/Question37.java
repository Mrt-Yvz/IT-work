package assignments.Ass11;

import java.util.Arrays;

public class Question37 {

	public static void main(String[] args) {
		String [] words = {"hello", "why", "by", "apple" , "note"};
		String [] output = new String[words.length];
		
		for(int i=0;i < words.length;i++) {
			output[i] = words[i].substring(0,1) + words[i].substring(words[i].length()-1);
		}
		System.out.println(Arrays.toString(output));
	}

}
