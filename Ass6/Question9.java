package assignments.Ass6;

public class Question9 {

	public static void main(String[] args) {
		
		String sign = "W";
		
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=8;j++) {
				
				System.out.print(sign + " ");
				if (sign== "W") {	// changing W-B within the row
					sign = "B";
				}else sign = "W";
			}
			System.out.println();
			if (sign== "W") {	// changing W-B for the column
				sign = "B";
			}else sign = "W";
		}

	}

}
