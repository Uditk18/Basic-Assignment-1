
//Program to remove spaces in a string
import java.util.*;

class RemoveSpace {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		String input = "Hello    sss dzv sv s";
		StringBuilder str = new StringBuilder();
		int flag = 0;
		//String str2=str.split(" ");
		for (int i = 0; i < input.length(); i++) 
		{
			if (input.charAt(i) != ' ') 
			{
				str.append(input.charAt(i));
				flag = 0;
			} 
			else 
			{
				flag++;
				if (flag == 1) 
				{
					str.append(" ");
				}
			}

		}

		System.out.println("Sentence without spaces = " + str.toString());

	}
}