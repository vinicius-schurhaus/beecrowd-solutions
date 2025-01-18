import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] N = new int[1000];

		int count = 0;
		for (int i = 0; i < 1000; i++) {
			if (count % T == 0 && count != 0) {
				count = 0;
				N[i] = count;
				count++;
			} else {
				N[i] = count;
				count++;
			}
		}

		for (int i = 0; i < 1000; i++) {
			System.out.println("N[" + i + "] = " + N[i]);
		}

		sc.close();
	}

}
