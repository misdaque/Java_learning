import animal.Animal;
import animal.Cat;

public class Main {
	public static void main(String args[]) {
		//System.out.println("ABC");
	//	return 0;
		Test vary=new Test();
		Test little= new Test();
		Test.getb();
		Test.setb(9);
	//	Test.getc(25);
		vary.seta(5);
		little.seta(6);
		vary.getc(12);
		System.out.println(vary.geta());
		System.out.println(little.geta());
		System.out.println(Test.getb());
		System.out.println(Test.getb());
		Test.setb(8);
		System.out.println(Test.getb());
		System.out.println(Test.getb());
	//	System.out.println(vary.getc());
		Animal cat= new Cat();
		
		
		
	}

}
