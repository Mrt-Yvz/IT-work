package assignments.Ass12;

import java.util.ArrayList;
import java.util.Arrays;

public class Question67 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		Integer[] dummy = {1,2,3,4,5,6};
		nums.addAll(Arrays.asList(dummy));
		timesTwo(nums);
	}
	public static void timesTwo(ArrayList<Integer> nums) {
		for(int i=0;i<nums.size();i++) {
			nums.set(i,nums.get(i)*2);
		}
		System.out.println(nums);
	}
}
