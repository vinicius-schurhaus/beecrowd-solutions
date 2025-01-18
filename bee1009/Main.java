import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salarioFixo, totalVendas, salarioTotal;
		
		nome = sc.next();
		salarioFixo = sc.nextDouble();
		totalVendas = sc.nextDouble();
		
		salarioTotal = salarioFixo + totalVendas * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f%n", salarioTotal);
		
		sc.close();
	}

}
