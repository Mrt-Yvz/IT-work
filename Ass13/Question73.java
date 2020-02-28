package assignments.Ass13;

public class Question73 {

	public static void main(String[] args) {
		
		String[][] money1 = {{"drachma","11.0"},{"sek","5.0"}};
		String[][] conversionRate1 = {{"drachma","0.6"},{"sek","100"}};
		
		String[][] money2 = {{"yen","5.0"},{"frank","5.0"}};
		String[][] conversionRate2 = {{"yen","1"},{"frank","1"}};
		
		System.out.println(convertC(money1, conversionRate1));
		System.out.println(convertC(money2, conversionRate2));

	}
	
	public static double convertC(String[][] money,String[][] conversionRate) {
		double sum = 0;
		for(int i=0;i<money.length;i++) {
			for(int j=0;j<conversionRate.length;j++) {
				if(money[i][0] == conversionRate[j][0]) {  //checking the name of the currency ( assuming they may not be in the same order)
					sum += Double.parseDouble(money[i][1]) * Double.parseDouble(conversionRate[i][1]);
				}
			}
		}
		return sum;
	}
}
