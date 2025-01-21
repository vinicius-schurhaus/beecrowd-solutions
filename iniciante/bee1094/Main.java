import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int qtd;
		int totalCoelhos = 0;
		int totalRatos = 0;
		int totalSapos = 0;
		char tipoCobaia;

		for (int i = 0; i < n; i++) {
			qtd = sc.nextInt();
			tipoCobaia = sc.next().charAt(0);
			if (tipoCobaia == 'C') {
				totalCoelhos += qtd;
			} else if (tipoCobaia == 'R') {
				totalRatos += qtd;
			} else if (tipoCobaia == 'S') {
				totalSapos += qtd;
			}
		}

		int totalCobaias = totalRatos + totalSapos + totalCoelhos;
		double percentualCoelhos = (double) totalCoelhos / totalCobaias * 100.00;
		double percentualRatos = (double) totalRatos / totalCobaias * 100.00;
		double percentualSapos = (double) totalSapos / totalCobaias * 100.00;

		System.out.printf("Total: %d cobaias%n", totalCobaias);
		System.out.printf("Total de coelhos: %d%n", totalCoelhos);
		System.out.printf("Total de ratos: %d%n", totalRatos);
		System.out.printf("Total de sapos: %d%n", totalSapos);
		System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
		System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos);

		sc.close();
	}

}
