package assignments.Ass9;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word : ");
		String wordCat = sc.next();
		String wordDog = wordCat;
		boolean flag = true;
		int catCount =0, dogCount=0;
		while((wordCat.toLowerCase().contains("cat") || (wordDog.toLowerCase().contains("dog")))) {
			if(wordCat.contains("cat")) {
				wordCat = wordCat.substring(wordCat.indexOf("cat")+3);
				catCount++;
			}
			if(wordDog.contains("dog")) {
				wordDog = wordDog.substring(wordDog.indexOf("dog")+3);
				dogCount++;
			}
			if(catCount != dogCount) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}

}
