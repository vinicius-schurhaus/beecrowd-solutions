import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] A = new double[100];

		for (int i = 0; i < 100; i++) {
			A[i] = sc.nextDouble();
		}

		for (int i = 0; i < 100; i++) {
			if (A[i] <= 10) {
				System.out.println("A[" + i + "] = " + A[i]);
			}
		}

		sc.close();
	}

}
