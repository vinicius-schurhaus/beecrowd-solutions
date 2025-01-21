import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int x1 = 0, x2 = 1;

		System.out.print(x1 + " " + x2 + " ");

		for (int i = 2; i < n; i++) {
			if (i == n - 1) {
				int soma = x1 + x2;
				System.out.println(soma);
				x1 = x2;
				x2 = soma;
			} else {
				int soma = x1 + x2;
				System.out.print(soma + " ");
				x1 = x2;
				x2 = soma;
			}
		}

		sc.close();
	}

}
