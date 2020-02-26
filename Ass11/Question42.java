package assignments.Ass11;

import java.util.Arrays;

public class Question42 {

	public static void main(String[] args) {
		
		String[] arr = {"zero", "one", "two","three","four"};
		String[] arr1 = {"e", "hey", "bye", "furey", "spoon"};
		String[] fewValues = eCheck(arr);
		String[] fewValues1 = eCheck(arr1);
		System.out.println(Arrays.toString(fewValues));
		System.out.println(Arrays.toString(fewValues1));
	}
	
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
