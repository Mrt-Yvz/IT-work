package assignments.Ass7;

public class Question4 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=7;i++) {
			int number = 1;
			for(int j=1;j<=i;j++) {
				System.out.print(number);
				if(number==1) {
					number=0;
				}else number = 1;
			}
			System.out.println();
		}

	}

}
