package assignments.Ass14_OOP;

public class Question07 {

	public static void main(String[] args) {
		
		GasTank gt = new GasTank(50);
		gt.addGas(20);
		System.out.println(gt.getGasLevel());
		
		
	}

}

class GasTank {
	
	private double amount = 0;
	double capacity ;
	
	public GasTank(double capacity) {
		this.capacity = capacity;
	}
	
	public void addGas(double num) {
		if(amount + num > capacity) {
			amount = capacity;
		}else amount += num;
	}
	
	public void useGas(double num) {
		if(amount - num < 0) {
			amount = 0;
		}else amount -= num;
	}
	
	public boolean isEmpty() {
		return amount < 0.1;
	}
	
	public boolean isFull() {
		return amount > capacity - 0.1;
	}
	
	public double getGasLevel() {
		return amount;
	}
	
	public double fillUp() {
		double req = capacity - amount;
		amount = capacity;
		return req;
	}
	
	
}