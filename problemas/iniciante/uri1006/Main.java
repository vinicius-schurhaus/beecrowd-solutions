import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double A = Double.parseDouble(br.readLine());
        double B = Double.parseDouble(br.readLine());
        double C = Double.parseDouble(br.readLine());

        double media = (2.0 * A + 3.0 * B + 5.0 * C) / 10.0;

        System.out.printf("MEDIA = %.1f%n", media);
    }
}
