
//Program to search for an element in an array
import java.util.*;

class ArraySearch {
	public static void main(String args[]) {
		//Taking array input
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[15];
		int ele, i;
		
		System.out.print("Enter array elements:");
		for (i = 0; i < 15; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter element to be searched:");
		ele = sc.nextInt();
		
		//Searching the array
		int flag = 0;
		for (i = 0; i < 15; i++) 
		{
			if (arr[i] == ele) 
			{
				System.out.print("Element Found");
				flag = 0;
				break;
			} else 
			{
				flag++;
			}

		}
		//Checking value of flag and printing
		if (flag != 0) 
		{
			System.out.print("Element not Found");

		}
	}

}
