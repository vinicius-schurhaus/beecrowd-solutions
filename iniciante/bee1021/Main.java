import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double N = sc.nextDouble();
		
		int notas100 = (int) N / 100;
		N = N % 100;
		int notas50 = (int) N / 50;
		N = N % 50;
		int notas20 = (int) N / 20;
		N = N % 20;
		int notas10 = (int) N / 10;
		N = N % 10;
		int notas5 = (int) N / 5;
		N = N % 5;
		int notas2 = (int) N / 2;
		N = N % 2;
		
		int moedas1 = (int) N / 1;
		N = N % 1;
		int moedas50 = (int) (N / 0.5);
		N = N % 0.50;
		int moedas25 = (int) (N / 0.25);
		N = N % 0.25;
		int moedas10 = (int) (N / 0.10);
		N = N % 0.10;
		int moedas05 = (int) (N / 0.05);
		N = N % 0.05;
		BigDecimal bd = new BigDecimal(N).setScale(2, RoundingMode.HALF_EVEN);
		int moedas01 = (int) (bd.doubleValue() / 0.010);

		System.out.println("NOTAS:");
		System.out.println(notas100 + " nota(s) de R$ 100.00");
		System.out.println(notas50 + " nota(s) de R$ 50.00");
		System.out.println(notas20 + " nota(s) de R$ 20.00");
		System.out.println(notas10 + " nota(s) de R$ 10.00");
		System.out.println(notas5 + " nota(s) de R$ 5.00");
		System.out.println(notas2 + " nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		System.out.println(moedas1 + " moeda(s) de R$ 1.00");
		System.out.println(moedas50 + " moeda(s) de R$ 0.50");
		System.out.println(moedas25 + " moeda(s) de R$ 0.25");
		System.out.println(moedas10 + " moeda(s) de R$ 0.10");
		System.out.println(moedas05 + " moeda(s) de R$ 0.05");
		System.out.println(moedas01 + " moeda(s) de R$ 0.01");
		
		sc.close();
	}

}
