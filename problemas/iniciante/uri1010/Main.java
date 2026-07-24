import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] linha1 = br.readLine().trim().split(" ");
        int numeroPecas1 = Integer.parseInt(linha1[1]);
        double valorUnitarioPeca1 = Double.parseDouble(linha1[2]);

        String[] linha2 = br.readLine().trim().split(" ");
        int numeroPecas2 = Integer.parseInt(linha2[1]);
        double valorUnitarioPeca2 = Double.parseDouble(linha2[2]);

        double valorTotal = numeroPecas1 * valorUnitarioPeca1 + numeroPecas2 * valorUnitarioPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
    }
}