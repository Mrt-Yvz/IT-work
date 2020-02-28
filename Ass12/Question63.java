package assignments.Ass12;

import java.util.ArrayList;
import java.util.Random;

public class Question63 {

	public static void main(String[] args) {
		ArrayList<Double> doubles =new ArrayList<>();
		Random rd = new Random();
		
		for(int i=0;i<5;i++) {
			doubles.add(rd.nextDouble()*10);
		}
		System.out.println("doubles ==> " + doubles);
		System.out.println("Final ==> " + minusTwo(doubles));
	}
	public static ArrayList<Double> minusTwo(ArrayList<Double> arl){
		arl.remove(0);
		arl.remove(0);
		return arl;
	}

}
