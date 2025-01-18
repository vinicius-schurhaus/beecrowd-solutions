import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int n1, n2, n3, n4, n5, n6;
		
		if (x % 2 == 0) {
			n1 = x + 1;
			n2 = n1 + 2;
			n3 = n2 + 2;
			n4 = n3 + 2;
			n5 = n4 + 2;
			n6 = n5 + 2;
		} else {
			n1 = x;
			n2 = n1 + 2;
			n3 = n2 + 2;
			n4 = n3 + 2;
			n5 = n4 + 2;
			n6 = n5 + 2;
		}
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);

		sc.close();
	}

}
