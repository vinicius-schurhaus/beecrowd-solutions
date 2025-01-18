import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] N = new double[100];
		double x = sc.nextDouble();

		N[0] = x;

		for (int i = 1; i < 100; i++) {
			N[i] = N[i - 1] / 2;
		}

		for (int i = 0; i < 100; i++) {
			System.out.printf("N[%d] = %.4f%n", i, N[i]);
		}

		sc.close();
	}

}
