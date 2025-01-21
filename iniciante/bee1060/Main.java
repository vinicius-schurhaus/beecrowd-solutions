import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double n5 = sc.nextDouble();
		double n6 = sc.nextDouble();

		int count = 0;

		if (n1 > 0) {
			count++;
		}

		if (n2 > 0) {
			count++;
		}

		if (n3 > 0) {
			count++;
		}

		if (n4 > 0) {
			count++;
		}

		if (n5 > 0) {
			count++;
		}

		if (n6 > 0) {
			count++;
		}

		System.out.println(count + " valores positivos");
		
		sc.close();
	}

}
