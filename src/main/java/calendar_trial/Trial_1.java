package calendar_trial;

public class Trial_1 {
	public static void main(String args[]) {
		String days_name[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int x;
		String Jan[] = new String[31];

		// System.out.println("January Month's detail");

		for (x = 0; x <= 30; x++) {

			/*if (m > 6) {

				m = 0;
			}*/
			//int l=x+1;

			Jan[x] = days_name[x%7];

			 System.out.println("January " + (x+1) + " is " + days_name[x%7]);
			//m++;
			// x=x+1;
		}
		
	//	System.out.println("January " +d + " is " + Jan[d=d-1]);

		/*String Feb[] = new String[28];


		for (x = 0; x <= 27; x++) {
			if (m > 6) {
				m = 0;
			}
			Feb[x] = days_name[m];
			m++;
		}
		int e=8;
	//	System.out.println("Feb "+e + " is " + Feb[e=e-1]);
		switch("January"){
		case "January":
			System.out.println("January " +d + " is " + Jan[d=d-1]);
			break;
			
		case "February":
			System.out.println("Feb " +e + " is " + Feb[e=e-1]);
			break;
		
			default:
				System.out.println("Please put correct data");
				
			
		}*/
	}

}
