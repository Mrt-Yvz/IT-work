package assignments.Ass13;

public class Question77 {

	public static void main(String[] args) {
	
		int[] products1 = {1,1,1,1};
		int[] products2 = {1,1,1,1,0,0,0,0};
		int[] products3 = {1,1,0,0};
		int[] products4 = {1,1,1,0};
		
		int limit1 = 5, limit2 = 2, limit3 = 2, limit4 = 6;
		
		System.out.println(badP(products1,limit1));
		System.out.println(badP(products2,limit2));
		System.out.println(badP(products3,limit3));
		System.out.println(badP(products4,limit4));
	}
	public static boolean badP(int[] products, int limit) {
		int sum = 0;
		for(int each:products) {
			sum += each;
		}
		if(products.length - sum >= limit) {
			return false;
		}else return true;
	}

}
