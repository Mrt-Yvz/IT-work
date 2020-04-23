package assignments.Ass14_OOP;

public class Question09 {

	public static void main(String[] args) {
		
		Telephone tlp1 = new Telephone();
		tlp1.setNumber("55");
		System.out.println(Telephone.quantity);
		System.out.println(tlp1.total);
		
		Telephone tlp2 = new Telephone();
		tlp2.total = 200;
		System.out.println(tlp2.total);
		System.out.println(tlp1.total);
		
	}

}

class Telephone {
	
	private String number;
	public static int quantity = 250;
	public static double total = 15658.92;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
