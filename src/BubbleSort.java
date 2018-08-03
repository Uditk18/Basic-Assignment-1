
//Program to implement bubble sort
import java.util.*;

class BubbleSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[15];
		int i;
		
		System.out.print("Enter array elements:");
		for (i = 0; i < 15; i++) 
		{
			arr[i] = sc.nextInt();
		}

		int temp = 0;
		
		for (i = 0; i < 15; i++) {
			for (int j = 1; j < (15 - i); j++) {
				if (arr[j - 1] > arr[j]) 
				{
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		
		System.out.println("Array After Bubble Sort");
		for (i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
	}
}
