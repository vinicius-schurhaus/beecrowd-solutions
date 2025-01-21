import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int count = 0;
			int soma = 0;
			for (int num = x; count < y; num++) {
				if (num % 2 != 0) {
					soma += num;
					count++;
				}
			}
			System.out.println(soma);
		}

		sc.close();
	}

}
