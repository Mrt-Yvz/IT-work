package assignments.Ass6;

public class Question5 {

	public static void main(String[] args) {
		
		int i = 1,end = 11;
		
		while(i<=end){
			if(i%2==1) {
				System.out.print(i);
				if(i==end) {
					break;
				}
				System.out.print(",");
			}
			i++;
		}

	}

}
