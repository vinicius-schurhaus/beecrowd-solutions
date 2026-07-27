import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] entrada = br.readLine().trim().split(" ");
        double a = Double.parseDouble(entrada[0]);
        double b = Double.parseDouble(entrada[1]);
        double c = Double.parseDouble(entrada[2]);

        boolean isTriangulo = (a < b + c) && (b < a + c) && (c < a + b);

        if (isTriangulo) {
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            double area = ((a + b) * c) / 2.0;
            System.out.printf("Area = %.1f%n", area);
        }
    }
}
