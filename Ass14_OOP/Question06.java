package assignments.Ass14_OOP;

public class Question06 {

	public static void main(String[] args) {
		
		ParkingMeter pm = new ParkingMeter(60);
		for(int i = 1;i<40;i++) {
			pm.tick();
		}
		
		System.out.println(pm.add(50));
		System.out.println(pm.add(25));
		pm.timeLeft = 20;
		System.out.println(pm.add(25));
		System.out.println(pm.timeLeft);
		
		pm.timeLeft = 1;
		pm.tick();
		pm.tick();
		System.out.println(pm.isExpired());
		
	}

}

class ParkingMeter {
	
	int timeLeft = 0;
	int maxTime;
	
	public ParkingMeter(int maxTime) {
		this.maxTime = maxTime;
	}
	
	public boolean add(int num) {
		if(num == 25 && timeLeft <= maxTime-30) {
			timeLeft += 30;
			return true;
		}else return false;
	}
	
	public void tick() {
		if(timeLeft > 0) {
			timeLeft--;
		}
	}
	
	public boolean isExpired() {
		return timeLeft == 0;
	}
	
}