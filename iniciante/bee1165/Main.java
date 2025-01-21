import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();

			if (x == 1) {
				System.out.println("1 nao eh primo");
			} else {
				int count = 0;
				for (int j = 1; j <= x; j++) {
					if (x % j == 0) {
						count++;
					}
				}
				if (count > 2) {
					System.out.println(x + " nao eh primo");
				} else {
					System.out.println(x + " eh primo");
				}
			}
		}

		sc.close();
	}

}
