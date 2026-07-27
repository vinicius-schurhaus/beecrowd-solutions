import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] entrada = br.readLine().trim().split(" ");
        int codigoItem = Integer.parseInt(entrada[0]);
        int quantidadeItem = Integer.parseInt(entrada[1]);

        double preco = 0.00;
        switch (codigoItem) {
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
            default:
                System.out.println("Item inválido!");
                break;
        }

        double total = preco * quantidadeItem;

        System.out.printf("Total: R$ %.2f%n", total);
    }
}