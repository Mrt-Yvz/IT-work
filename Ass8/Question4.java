package assignments.Ass8;

public class Question4 {

	public static void main(String[] args) {
		
		printHollowRect(5,5);

	}

	public static void printHollowRect(int row,int column) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=column;j++) {
				if(i==1||i==row) {
					System.out.print("*");
				}else if (j==1||j==column) {
					System.out.print("*");
				}else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
