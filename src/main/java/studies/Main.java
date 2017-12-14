package studies;

public class Main {
	public static void main(String args[]) {
		int a = 'a';
		boolean b = false;
		byte c=127;
		for(int d=0; d<=3;d++) {
			
		System.out.println(c);
		c++;
		}
		
		Engineering eceObject = new ECE();
		Engineering cseObject = new CSE();
		Engineering mechObject = new MECH();

		eceObject.Branch();
		cseObject.Branch();
		mechObject.Branch();

		System.out.println(eceObject.Branch());
		System.out.println(cseObject.Branch());
		System.out.println(mechObject.Branch());
		System.out.println(a);
		System.out.println("10 > 9 is " + (10 < 9));
		System.out.println("The boolean is " + b);
		
		b= true;
		
		System.out.println("Changed value of boolean is " + b);
		if (b) {
			b= false;
			System.out.println("The conditional changed value is " + b);
		}

	}

}
