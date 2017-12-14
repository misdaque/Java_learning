import java.util.Scanner;
public class Fourth
{
	public static void main(String args[]) {
		Scanner Frank = new Scanner(System.in);
		Scanner Anna= new Scanner(System.in);
	    int age;
	    System.out.println("Enter the age of the kid");
	    age = Frank.nextInt();
	    switch(age){
	    case 1:
	    	System.out.println("The kid is just a baby" );
	    	break;
	    case 2:
	    	System.out.println("The kid started talking");
	    	break;
	    case 3:
	    	System.out.println("The Kid turned a little naughty");
	    	break;
	    default:
	    	System.out.println("The kid is old enough ");
	    	break;
	    }
		
	}
	

}
