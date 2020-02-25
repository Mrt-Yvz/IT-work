package assignments.Ass9;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		String startPoint,endPoint, result="";
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your starting point (A /B /C / D): ");
			startPoint = sc.next();
			if("a b c d".contains(startPoint.toLowerCase())) {
				break;
			}else System.out.println("Invalid entry");
		}
		while(true) {
			System.out.println("Enter your arrival point (A /B /C / D): ");
			endPoint = sc.next();
			if("a b c d".contains(endPoint.toLowerCase())) {
				break;
			}else System.out.println("Invalid entry");
		}
		
		startPoint = startPoint.toUpperCase();
		endPoint=endPoint.toUpperCase();
		String points = "ABCDABC";
		String[] directions = {"right","down","left","up","right","down"}; // respective moving directions for each letter
		
		int startIndex = points.indexOf(startPoint); // finding the index of starting point
		int endIndex = points.indexOf(endPoint,startIndex); // looking forward from the starting point to find the arrival point
		
		if(startPoint.equals(endPoint)) {
			System.out.println(startPoint + " found");
		}else {
			for(int i=startIndex;i<endIndex-1;i++) { // matching the index of points to the directions
				result= result + directions[i] +" > ";
			}
			result = result + directions[endIndex-1]+ " : ";
		}
		System.out.println(result + endPoint + " found");
	}
}
