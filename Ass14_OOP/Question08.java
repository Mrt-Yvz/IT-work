package assignments.Ass14_OOP;

public class Question08 {

	public static void main(String[] args) {
		

	}

}

class Value {
	private int val = 0;
	private int setValue;
	private int setCount;
	
	
	public Value() {
	}

	public Value(int val) {
		this.val = val;
		
	}

	public int getVal() {
		if(setCount > 0) {
			return setValue;
		}else return val;
	}

	public void setVal(int val) {
		this.val = val;
		setValue = val;
		setCount++;
	}
	
	public boolean wasModified() {
		return setCount > 0;
	}
	
	
}