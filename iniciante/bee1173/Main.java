import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] N = new int[10];
		int n = sc.nextInt();

		N[0] = n;

		for (int i = 1; i < 10; i++) {
			N[i] = 2 * N[i - 1];
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("N[" + i + "] = " + N[i]);
		}

		sc.close();
	}

}
