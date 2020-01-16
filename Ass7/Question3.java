package assignments.Ass7;

public class Question3 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=7;i++) {
			for(int k=0;k<(i-1);k++) {	// loop for the pre-spaces
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i=6;i>=1;i--) {
			for(int k=1;k<i;k++) {	// loop for the pre-spaces
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
