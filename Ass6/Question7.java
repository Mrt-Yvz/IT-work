package assignments.Ass6;

public class Question7 {

	public static void main(String[] args) {
		
		for(int i=1;5-i>=1;i++) {
			for(int j=1;j<i;j++) {	// initial space loop
				System.out.print(" ");
			}
			
			for(int k=5-i;k>0;k--) {	// numbers loop
				System.out.print(k+" ");
			}
			
			System.out.println();
		}

	}

}
