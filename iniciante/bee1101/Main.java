import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int min, max;

		while (m > 0 && n > 0) {
			if (m < n) {
				min = m;
				max = n;
			} else {
				min = n;
				max = m;
			}

			int soma = 0;

			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
				soma += i;
			}

			System.out.println("Sum=" + soma);
			m = sc.nextInt();
			n = sc.nextInt();
		}

		sc.close();
	}

}
