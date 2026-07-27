import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] entrada = br.readLine().trim().split(" ");
        double x = Double.parseDouble(entrada[0]);
        double y = Double.parseDouble(entrada[1]);

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else {
            if (x != 0) {
                System.out.println("Eixo X");
            } else if (y != 0) {
                System.out.println("Eixo Y");
            } else {
                System.out.println("Origem");
            }
        }
    }
}
