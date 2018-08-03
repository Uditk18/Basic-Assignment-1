import java.util.*;

class Date {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in format DD,MM,YYYY : ");
		String date = sc.nextLine();

//fetching month number as string from date and converting it to integer

		int month = Integer.parseInt(date.substring(3, 5));

//Storing all months for reference

		String arr[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		System.out.println(date.substring(0, 2) + "/" + arr[month - 1] + "/" + date.substring(6, 10));
	}
}
