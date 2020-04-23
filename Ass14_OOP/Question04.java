package assignments.Ass14_OOP;

public class Question04 {

	public static void main(String[] args) {
		
		Person person = new Person();

		System.out.println(person.getFirstName()); 
		System.out.println(person.getLastName()); 
		System.out.println(person.getAge()); 
		System.out.println(person.toString()); 

		person.setFirstName("John");
		person.setLastName("Doe");
		person.setAge(44);

		System.out.println(person.toString() ); 
		
		Person person2 = new Person("Fatima", "Lee", 22);

		System.out.println(person2.getFirstName()); 
		System.out.println(person2.getLastName()); 
		System.out.println(person2.getAge()); 
		System.out.println(person2.toString());
	}

}

class Person {
	
	private String firstName, lastName;
	private int age;
	
	
	public Person() {
		firstName ="undefined";
		lastName = "undefined";
		age = -1;
	}
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return firstName + "|" + lastName + "|" + age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}