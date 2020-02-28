package assignments.Ass13;

public class Question80 {

	public static void main(String[] args) {
		short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		int countHalf=0, countCent=0, countDouble=0;
		
		for(short each:scores) {
			if(each>=200) {
				countDouble++;
			}else if(each>=100) {
				countCent++;
			}else if(each>=50) {
				countHalf++;
			}
		}
		System.out.println("Half-Centruies\t\t:" + countHalf);
		System.out.println("Centruies\t\t:" + countCent);
		System.out.println("Double-Centruies\t:" + countDouble);
	}

}
