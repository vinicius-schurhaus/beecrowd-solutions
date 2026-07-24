import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int distancia = Integer.parseInt(br.readLine());

        int tempo = 2 * distancia;

        System.out.println(tempo + " minutos");
    }
}
