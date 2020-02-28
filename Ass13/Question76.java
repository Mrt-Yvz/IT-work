package assignments.Ass13;

import java.util.ArrayList;
import java.util.Arrays;

public class Question76 {

	public static void main(String[] args) {
		
		Integer[] arr = {1,5,3,7};
		ArrayList<Integer> ints = new ArrayList<>();
		ints.addAll(Arrays.asList(arr));
		
		System.out.println(twoTimes(ints));

	}
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> ints){
		ArrayList<Integer> dummy = new ArrayList<>();
		for(int i=0;i<ints.size();i++) {
			dummy.add(2*i,ints.get(i));
			dummy.add(2*i+1,ints.get(i));
		}
		return dummy;
	}
}
