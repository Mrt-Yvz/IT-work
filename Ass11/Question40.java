package assignments.Ass11;

public class Question40 {

	public static void main(String[] args) {
		String[] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
		String largest = words[0];
		
		for(String each:words) {
			if(each.length()>largest.length()) {
				largest = each;
			}
		}
		System.out.println(largest);
	}

}
