package assignments.Ass11;

import java.util.Arrays;

public class Question42 {

	public static void main(String[] args) {
		
		String[] arr = {"zero", "one", "two","three","four"};
		String[] arr1 = {"e", "hey", "bye", "furey", "spoon"};
		
		
		String[] fewValues1 = includeE(arr);	// Solution 1
		String[] fewValues2 = eCheck(arr1);	 	// Solution 2
		
		System.out.println(Arrays.toString(fewValues1));	 
		System.out.println(Arrays.toString(fewValues2));	
		
		
	}
	//Solution 1  -  Shorter
	public static String[] includeE(String[] arr) {
		
		String str = "";
		for(String each:arr) {
			if(each.contains("e")) {
				str = str + " " + each;
			}
		}
		String[] fewValues = str.trim().split(" ");
		return fewValues;
				
	}
	//Solution 2 - Just because the question says "You need to know how many element contain "e" and create array accordingly"
	public static int arrSize(String[] arr) {
		int size = 0;
		for(String each:arr) {
			if(each.contains("e")) {
				size +=1;
			}
		}
		return size;
	}
	
	public static String[] eCheck(String[] arr) {
		int i=0;
		String[] fewValues = new String[arrSize(arr)];
		for(String each:arr) {
			if(each.contains("e")) {
				fewValues[i]= each;
				i++;
			}
		}
		return fewValues;
	}
}
