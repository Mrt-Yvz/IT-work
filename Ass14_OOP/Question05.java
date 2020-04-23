package assignments.Ass14_OOP;

public class Question05 {

	public static void main(String[] args) {
		
		TV tv = new TV("Samsung");
		tv.setChannel(5);
		tv.turnOn();
		tv.setChannel(120);
		tv.turnOn();
		tv.channelUp();
		tv.setVolumeLevel(1);
		tv.volumeDown();
		tv.isOn();

	}

}

class TV {
	
	private int channel = 1;
	private int volumeLevel = 1;
	public boolean on = false;
	private String brand = "undefined";
	
	public TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}

	public TV(String brand) {
		System.out.println("Creating TV object using 1 arg - constructor");
		this.brand = brand;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(!on || channel>120 || channel <1) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}else this.channel = channel;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if(!on || volumeLevel<1 || volumeLevel>7) {
			System.out.println("ERROR: TV is either OFF or invalid Volume Level");
		}else this.volumeLevel = volumeLevel;
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void channelUp() {
		if(channel<120) {
			channel++;
		}else System.out.println("Max allowed Channel is 120");
	}
	
	public void channelDown() {
		if(channel>1) {
			channel--;
		}else System.out.println("Min allowed Channel is 1");
	}
	
	public void volumeUp() {
		if(volumeLevel<7){
			volumeLevel++;
		}else System.out.println("Max allowed Volume Level is 7");
	}
	
	public void volumeDown() {
		if(volumeLevel>1){
			volumeLevel--;
		}else System.out.println("Min allowed Volume Level is 1");
	}
	
	public void isOn() {
		if(on) {
			System.out.println("TV is ON");
		}else System.out.println("TV is OFF");
	}
	
	public void turnOn() {
		if(on) {
			System.out.println("TV is already ON");
		}else {
			on = true;
			System.out.println("Tv has been turned ON");
		}
	}
	
	public void turnOff() {
		if(!on) {
			System.out.println("TV is already OFF");
		}else {
			on = false;
			System.out.println("Tv has been turned OFF");
		}
	}
	
	
}