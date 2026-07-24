import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final double PERCENTUAL_COMISSAO = 0.15;

        String nomeVendedor = br.readLine();
        double salarioFixo = Double.parseDouble(br.readLine());
        double valorVendido = Double.parseDouble(br.readLine());

        double totalComissao = valorVendido * PERCENTUAL_COMISSAO;
        double salarioTotal = salarioFixo + totalComissao;

        System.out.printf("TOTAL = R$ %.2f%n", salarioTotal);
    }
}
