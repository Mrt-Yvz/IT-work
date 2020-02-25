package assignments.Ass9;

public class Question11 {

	public static void main(String[] args) {
		String message = "Sender<Mike Smith>. From Number:[202-123-3456]. Message"
				+ ":{I love programming and problem solving}";
		
		String sender,phoneNumber,messageBody;
		sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
		phoneNumber = message.substring(message.indexOf("[")+1,message.indexOf("]"));
		messageBody = message.substring(message.indexOf("{")+1,message.indexOf("}"));
		
		System.out.println("Sender \t\t: " + sender);
		System.out.println("Phone Number \t: " + phoneNumber);
		System.out.println("Message Body \t: " + messageBody);
	}

}
