package assignments.Ass13;

public class Question72 {

	public static void main(String[] args) {
		int[] arr1 = {7,7,7}, arr2 = {9,1}, arr3 = {100,200,10};
		int max_fuel1 = 7, max_fuel2 = 3, max_fuel3 = 10;
		
		System.out.println(refuel_times(arr1,max_fuel1));
		System.out.println(refuel_times(arr2,max_fuel2));
		System.out.println(refuel_times(arr3,max_fuel3));
	}
	public static int refuel_times(int[] arr, int max_fuel) {
		int sum = 0;
		for(int each:arr) {
			sum += each;
		}
		return (int) Math.ceil((double)sum/max_fuel);
	}
}
