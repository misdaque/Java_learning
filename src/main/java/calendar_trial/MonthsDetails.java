package calendar_trial;

import java.util.Scanner;

public class MonthsDetails {
	public void Details() {

		Scanner monthObj = new Scanner(System.in);

		String days_name[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int m = 0, x;
		System.out.println("Give name of the Month. For ex 'February' or ' December'");
		String Month = monthObj.nextLine();
		System.out.println("Input Date. For ex. '5' or '28'");
		int date = monthObj.nextInt();

		String Jan[] = new String[31];
		for (x = 0; x <= 30; x++) {

		/*	if (m > 6) {

				m = 0;
			}*/

			Jan[x] = days_name[m];

			m= (m+1)%7;

		}

		String Feb[] = new String[28];

		for (x = 0; x <= 27; x++) {

			if (m > 6) {

				m = 0;
			}

			Feb[x] = days_name[m];

			m++;
		}

		String Mar[] = new String[31];

		for (x = 0; x <= 30; x++) {

			if (m > 6) {

				m = 0;
			}

			Mar[x] = days_name[m];

			m++;

		}

		String Apr[] = new String[30];

		for (x = 0; x <= 29; x++) {

			if (m > 6) {

				m = 0;
			}

			Apr[x] = days_name[m];

			m++;

		}

		String May[] = new String[31];

		for (x = 0; x <= 30; x++) {

			if (m > 6) {

				m = 0;
			}

			May[x] = days_name[m];

			m++;

		}

		String Jun[] = new String[30];

		for (x = 0; x <= 29; x++) {

			if (m > 6) {

				m = 0;
			}

			Jun[x] = days_name[m];

			m++;

		}

		String Jul[] = new String[31];

		for (x = 0; x <= 30; x++) {

			if (m > 6) {

				m = 0;
			}

			Jul[x] = days_name[m];

			m++;

		}

		String Aug[] = new String[31];

		for (x = 0; x <= 30; x++) {

			if (m > 6) {

				m = 0;
			}

			Aug[x] = days_name[m];

			m++;

		}

		String Sep[] = new String[30];

		for (x = 0; x <= 29; x++) {

			if (m > 6) {

				m = 0;
			}

			Sep[x] = days_name[m];

			m++;

		}

		String Oct[] = new String[31];

		for (x = 0; x <= 30; x++) {

			if (m > 6) {

				m = 0;
			}

			Oct[x] = days_name[m];

			m++;

		}

		String Nov[] = new String[30];

		for (x = 0; x <= 29; x++) {

			if (m > 6) {

				m = 0;
			}

			Nov[x] = days_name[m];

			m++;

		}

		String Dec[] = new String[31];

		for (x = 0; x <= 30; x++) {

			if (m > 6) {

				m = 0;
			}

			Dec[x] = days_name[m];

			m++;
		}

		switch (Month) {
		case "January":
			if (date < 31)
				System.out.println("January " + date + " is " + Jan[date = date - 1]);
			else
				System.out.println("Please Provide proper Date");
			break;
		case "February":
			if (date < 28)
				System.out.println("February " + date + " is " + Feb[date = date - 1]);
			else
				System.out.println("Please Provide proper Date");
			break;
		case "March":
			if (date < 31)
				System.out.println("March " + date + " is " + Mar[date = date - 1]);
			else
				System.out.println("Please Provide proper Date");
			break;
		case "April":
			if (date < 30)
				System.out.println("April " + date + " is " + Apr[date = date - 1]);
			else
				System.out.println("Please Provide proper Date");
			break;
		case "May":
			if (date < 31)
				System.out.println("May " + date + " is " + May[date = date - 1]);
			else
				System.out.println("Please Provide proper Date");
			break;
		case "June":
			if (date < 30)
				System.out.println("June " + date + " is " + Jun[date = date - 1]);
			else
				System.out.println("Please Provide proper Date");
			break;
		case "July":
			if (date < 31)
				System.out.println("July " + date + " is " + Jul[date = date - 1]);
			else
				System.out.println("Please Provide proper Date");
			break;
		case "August":
			if (date < 31)
				System.out.println("August " + date + " is " + Aug[date = date - 1]);
			else
				System.out.println("Please Provide proper Date");
			break;
		case "September":
			if (date < 30)
				System.out.println("September " + date + " is " + Sep[date = date - 1]);
			else
				System.out.println("Please Provide proper Date");
			break;
		case "October":
			if (date < 31)
				System.out.println("October " + date + " is " + Oct[date = date - 1]);
			else
				System.out.println("Please Provide proper Date");
			break;
		case "November":
			if (date < 30)
				System.out.println("November " + date + " is " + Nov[date = date - 1]);
			else
				System.out.println("Please Provide proper Date");
			break;
		case "December":
			if (date < 31)
				System.out.println("December " + date + " is " + Dec[date = date - 1]);
			else
				System.out.println("Please Provide proper Date");
			break;
		default:
			System.out.println("Please Check Spelling of the Month provided and Check the date");
			break;
		}

	}
}