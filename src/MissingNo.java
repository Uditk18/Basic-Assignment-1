
//Find out the missing number in the list
import java.util.*;

class MissingNo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		//taking array input
		System.out.println("Enter arrray elements:");
		for (int i = 0; i < 5; i++) 
		{
			arr[i] = sc.nextInt();
		}
		//taking 2 temporary variables
		int k = 0, temp = 0;
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if (arr[j] == k) 
				{
					k++;
				} 
				else 
				{
					temp = k;
					break;
				}
			}

		}
		System.out.print("Missing number is = " + temp);

	}
}