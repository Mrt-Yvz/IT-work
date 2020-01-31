package assignments.Ass8;

public class Question16 {

	public static void main(String[] args) {
		
		boolean rentable;
		
		rentable = simpleRoomBook(false,2,1,2018);
		System.out.println(rentable);
		
		rentable = simpleRoomBook(true,2,1,2018);
		System.out.println(rentable);
		
		rentable = simpleRoomBook(true,7,2,2018);
		System.out.println(rentable);	
	}
	
	public static boolean simpleRoomBook(boolean available, int month, int day, int year) {
		return (available && year == 2018 && !(month == 7 && day <=8));
	}
}
