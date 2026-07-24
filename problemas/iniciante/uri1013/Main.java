import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] entrada = br.readLine().trim().split(" ");
        int a = Integer.parseInt(entrada[0]);
        int b = Integer.parseInt(entrada[1]);
        int c = Integer.parseInt(entrada[2]);

        int maior = (a + b + Math.abs(a - b)) / 2;
        maior = (maior + c + Math.abs(maior - c)) / 2;

        System.out.println(maior + " eh o maior");
    }
}
