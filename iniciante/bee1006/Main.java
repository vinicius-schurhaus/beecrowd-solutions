import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A, B, C, media;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		media = (A * 2 + B * 3 + C * 5) / 10;
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		sc.close();
	}

}
