package assignments.Ass11;

public class Question45 {

	public static void main(String[] args) {
		String[] str = { "java", "cable", "red", "vivid", "remedy", "grace"};
		String shortest = str[0];
		for(String each:str) { 		
			if(each.length()<shortest.length()) {
				shortest = each;
			}
		}
		System.out.println(shortest);
	}

}
