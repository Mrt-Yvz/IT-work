package assignments.Ass9;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word : ");
		String wordCat = sc.next();
		String wordDog = wordCat;
		boolean flag = true;
		int catFlag =1, dogFlag=1;
		while((wordCat.toLowerCase().contains("cat") || (wordDog.toLowerCase().contains("dog")))) {
			if(wordCat.contains("cat")) {
				wordCat = wordCat.substring(wordCat.indexOf("cat")+3);
				catFlag *=-1;
			}
			if(wordDog.contains("dog")) {
				wordDog = wordDog.substring(wordDog.indexOf("dog")+3);
				dogFlag *=-1;
			}
			if(catFlag != dogFlag) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}

}
