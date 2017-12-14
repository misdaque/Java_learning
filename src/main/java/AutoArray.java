
public class AutoArray {
	public static void main(String args[]) {
		int month_days[] = { 31, 28, 31, 30 };
		System.out.println("Feb has " + month_days[1] + " days");
		
		String week_days[] = new String [3];
		week_days[0]= "Monday";
		week_days[1]= "Tuesday";
		week_days[2]="Wednesday";
		
		
	//	int y=0;
		
		for(int x=0; x<3; x++) {
			//int y=0;
			System.out.println((x+1) + " day of the week is " +week_days[x]);
			//y++;
		}
	}
}
