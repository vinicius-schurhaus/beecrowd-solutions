import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		double x = 0;

		switch (a) {
		case 1:
			x = 4.00;
			break;
		case 2:
			x = 4.50;
			break;
		case 3:
			x = 5.00;
			break;
		case 4:
			x = 2.00;
			break;
		case 5:
			x = 1.50;
			break;
		}

		double total = x * b;

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();
	}

}
