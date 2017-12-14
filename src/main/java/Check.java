import java.util.Scanner;
public class Check {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Test2 fobject = new Test2();
		Test2 sobject = new Test2();
		
		//System.out.println("Input your name ");
		//String name=input.nextLine();
		fobject.Simple("Misdaque Azdee");
		//sobject.geta();
		System.out.println(sobject.geta(20));
		fobject.getsubject("JAVA");
	}
}
