package assignments.Ass11;

public class Question41 {

	public static void main(String[] args) {
		int treeSize = 0, year = 10;
		
		for(int i = 1;i<=year;i++) {
			if(i>3) {
				treeSize += 2;
				System.out.println("year " + i + " - growth 2 cm \ntree size: " + treeSize + "cm");
			}else {
				treeSize += 1;
			System.out.println("year " + i + " - growth 1 cm \ntree size: " + treeSize + "cm");
			}
		}
		
	}

}
