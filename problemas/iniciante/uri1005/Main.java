import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double A = Double.parseDouble(br.readLine());
        double B = Double.parseDouble(br.readLine());

        double media = (3.5 * A + 7.5 * B) / 11.0;

        System.out.printf("MEDIA = %.5f%n", media);
    }
}
