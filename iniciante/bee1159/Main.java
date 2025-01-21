import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 0) {
			if (x % 2 == 0) {
				int n1 = x;
				int n2 = n1 + 2;
				int n3 = n2 + 2;
				int n4 = n3 + 2;
				int n5 = n4 + 2;
				int soma = n1 + n2 + n3 + n4 + n5;
				System.out.println(soma);
				x = sc.nextInt();
			} else {
				int n1 = x + 1;
				int n2 = n1 + 2;
				int n3 = n2 + 2;
				int n4 = n3 + 2;
				int n5 = n4 + 2;
				int soma = n1 + n2 + n3 + n4 + n5;
				System.out.println(soma);
				x = sc.nextInt();
			}
		}

		sc.close();
	}

}
