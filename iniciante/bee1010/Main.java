import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo1, qtd1, codigo2, qtd2;
		double valorUnitario1, valorUnitario2, valorPago;

		codigo1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		valorPago = qtd1 * valorUnitario1 + qtd2 * valorUnitario2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);
				
		sc.close();
	}

}
