import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, C, x, y, maior;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		x = (A + B + Math.abs(A - B)) / 2;
		y = (B + C + Math.abs(B - C)) / 2;
		maior= (x + y + Math.abs(x - y)) / 2;
		
		
		System.out.println(maior + " eh o maior");
		
		sc.close();
	}

}
