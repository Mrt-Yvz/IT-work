package assignments.Ass12;

import java.util.ArrayList;
import java.util.Arrays;

public class Question60 {

	public static void main(String[] args) {
		
		String[] arr1 = {"f","o","o"};
		String[] arr2 = {"b","a","r"};
		ArrayList<String> combined = new ArrayList<>();
		
		
		for(String each:arr1) {
			combined.add(each);
		}
		for(String each:arr2) {
			combined.add(each);
		}
		System.out.println(String.join("",combined));
	}

}
