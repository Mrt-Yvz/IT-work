package assignments.Ass8;

public class Question17 {

	public static void main(String[] args) {
		
		System.out.println(getThunderBlazz(true,false,1,2,3));
		
		System.out.println(getThunderBlazz(false,false,1,2,3));

		System.out.println(getThunderBlazz(false,false,1,5,3));

		System.out.println(getThunderBlazz(false,false,3,1,2));

		System.out.println(getThunderBlazz(false,false,3,1,1));

		System.out.println(getThunderBlazz(false,true,9,7,3));

	}

	public static boolean getThunderBlazz(boolean available, boolean gift, int ing1, int ing2, int ing3) {
		return available || gift || (ing1==1 && ing2==2 && ing3==3) || (ing1==3 && ing2==1 && ing3==2);
	}
}
