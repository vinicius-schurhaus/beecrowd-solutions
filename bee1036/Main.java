import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double delta = Math.pow(B, 2) - 4.0 * A * C;

		if (delta < 0.0 || A == 0) {
			System.out.println("Impossivel calcular");
		} else if (delta > 0) {
			double R1 = (-B + Math.sqrt(delta)) / (2.0 * A);
			System.out.printf("R1 = %.5f%n", R1);
			double R2 = (-B - Math.sqrt(delta)) / (2.0 * A);
			System.out.printf("R2 = %.5f%n", R2);
		}

		sc.close();
	}

}
