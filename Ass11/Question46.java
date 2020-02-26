package assignments.Ass11;

import java.util.Arrays;

public class Question46 {

	public static void main(String[] args) {
		String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
		String[] words = str.split(", ");
		String shortest = words[0];
		String result = "";
		
		for(String each:words) { 		
			if(each.length()<shortest.length()) {
				shortest = each;		
				result = shortest;		// resetting result if shortest is updated
			}else if(each.length() == shortest.length()) { 	//to concatenate all words with the length of shortest
				result = result + " " + each;
			}
		}
		String [] output = result.split(" ");
		Arrays.sort(output);
		System.out.println(Arrays.toString(output));
		

	}

}
