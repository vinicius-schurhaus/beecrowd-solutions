import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int pA = sc.nextInt();
			int pB = sc.nextInt();
			double g1 = sc.nextDouble();
			double g2 = sc.nextDouble();

			int countAnos = 0;

			while (pA <= pB && countAnos <= 100) {
                pA += pA * (g1 / 100);
                pB += pB * (g2 / 100);
                countAnos++;
            }

			if (countAnos > 100) {
				System.out.println("Mais de 1 seculo.");
			} else {
				System.out.println(countAnos + " anos.");
			}
		}

		sc.close();
	}

}
