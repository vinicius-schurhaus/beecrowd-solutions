import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] entrada = br.readLine().trim().split(" ");
        int x1 = Integer.parseInt(entrada[0]);
        int x2 = Integer.parseInt(entrada[1]);
        int x3 = Integer.parseInt(entrada[2]);

        if (x1 <= x2 && x1 <= x3) {
            System.out.println(x1);

            if (x2 <= x3) {
                System.out.println(x2);
                System.out.println(x3);
            } else {
                System.out.println(x3);
                System.out.println(x2);
            }
        } else if (x2 <= x1 && x2 <= x3) {
            System.out.println(x2);

            if (x1 <= x3) {
                System.out.println(x1);
                System.out.println(x3);
            } else {
                System.out.println(x3);
                System.out.println(x1);
            }
        } else {
            System.out.println(x3);

            if (x1 <= x2) {
                System.out.println(x1);
                System.out.println(x2);
            } else {
                System.out.println(x2);
                System.out.println(x1);
            }
        }

        System.out.println();
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
