package calendar_trial;

import java.util.Scanner;

public class Trial_2 {
	public static void main(String args[]) {
		Scanner FObject = new Scanner(System.in);
		String Day_name[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String Month_name[] = { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		int Month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int size = Month_name.length;
		// System.out.println(size);//Remove this
		int sum = 0;

		for (int x = 0; x < size; x++)
			sum = sum + Month_days[x]; /* To find Total number of days in a year */

		// System.out.println(sum);//Remove This
		System.out.println("Please feed the Month name. For ex. 'January' or ''March'");
		String Name = FObject.nextLine();
		System.out.println("Please provide a proper date. For Ex '31' or '5'");
		int Date = FObject.nextInt();

		int b = 0, c = 0;
		for (int a = 0; a < size; a++) {
			if (Name.equals(Month_name[a])) {
				// System.out.println("Month found " +Month_name[a] +" " +a);Remove this
				c = a; /*
						 * To Find the Position of the Month to find the total days till that month
						 */
				break;
			}
			b = a;
		}

		if (b == 11)
			System.out.println("Please Provide a proper Month Name");
		
		int sum2 = 0, add;

		if (Date < Month_days[c]) {
			
			for (int x = 0; x <= c - 1; x++) { /*
												 * To Calculate total number of days till that month. why am i unable to
												 * use sum2 value after the loop???
												 */
				sum2 = sum2 + Month_days[x];
				
			}
			add = sum2 + Date;
			System.out.println(add);
			
			add=add%7;
			
			
			
		} else
			System.out.println("Please Provide a Proper Date");
		
		
	}
}