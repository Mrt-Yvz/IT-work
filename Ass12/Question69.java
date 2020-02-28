package assignments.Ass12;

import java.util.ArrayList;

public class Question69 {

	public static void main(String[] args) {
		
		ArrayList<Boolean> list = new ArrayList<>();
		list.add(true);list.add(false);list.add(false);
		repeatAL(list);
	}
	public static void repeatAL(ArrayList<Boolean> list) {
		list.addAll(list);
		System.out.println(list);
	}
	
}
