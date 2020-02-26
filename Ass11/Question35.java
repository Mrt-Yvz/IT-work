package assignments.Ass11;

public class Question35 {
	
	public static void main(String[] args) {
		String sentence = "Java is fun";
		String[] arr = sentence.split(" ");
		String reverse ="";
		for(int i=arr.length-1;i>=0;i--) {
			reverse = reverse + arr[i] + " ";
		}
		reverse = reverse.trim();
		System.out.println(reverse);
	}
}
