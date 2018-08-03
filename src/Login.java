
//Program to implement login system, giving 2 chances to reenter the password if wrong
import java.util.*;

class Login {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name, pass;
		int count = 0;

		while (true) {
			System.out.print("Please enter your username:");
			name = sc.nextLine();

			System.out.print("Please enter your password:");
			pass = sc.nextLine();
			if (name.equals("Udit") && pass.equals("lol")) {
				System.out.println("\n**Welcome**");
				break;
			}
			if (count == 3) {
				System.out.println("\n**Contact Admin**");
				break;
			} else {
				System.out.println("\nPlease try again!\n");
				count++;
				continue;
			}

		}
	}
}
