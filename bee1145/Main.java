import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		for (int i = 1; i <= y; i++) {
			if (i % x != 0) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
