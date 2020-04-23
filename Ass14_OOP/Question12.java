package assignments.Ass14_OOP;

public class Question12 {

	public static void main(String[] args) {
		
		CameraPhone cp = new CameraPhone(4, 5);
		
		System.out.println(cp.numPictures());

	}

}

class Phone {
	
}

class CameraPhone {
	int imageSize;
	int memorySize;
	
	public CameraPhone(int imageSize, int memorySize) {
		this.imageSize = imageSize;
		this.memorySize = memorySize;
	}
	
	public int numPictures() {
		return memorySize*1000/imageSize;
	}
}