import java.util.Scanner;

public class FindGreaterNumber {
	int num1, num2;

	public void findGreatertNum() {
		System.out.println("Please input Two Numbers:");
		Scanner keyboard = new Scanner(System.in);
		num1 = keyboard.nextInt();
		num2 = keyboard.nextInt();

		if (num1 > num2) {
			System.out.println("num1   " + num1 + "   is Largest value");
		} else {
			System.out.println("num2   " + num2 + "   is Largest value");
		}
	}
}