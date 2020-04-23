package assignments.Ass14_OOP;

public class Question01 {
	
	public static void main(String[] args) {
		
		Atts a = new Atts();
		a.name = "table";
		a.color = "brown";
		a.amount = 1;
		
		System.out.println(a.asString());
		
	}

}

class Atts{
	
	public String name;
	public String color;
	public int amount;
	
	public String asString() {
		return "name:" + name + " color:" + color + " amount:" + amount;
	}
	
}