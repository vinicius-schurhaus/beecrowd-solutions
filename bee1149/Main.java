import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int n;

		do {
			n = sc.nextInt();
		} while (n <= 0);

		int soma = 0;
		for (int i = 0; i < n; i++) {
			soma += a + i;
		}

		System.out.println(soma);

		sc.close();
	}

}
