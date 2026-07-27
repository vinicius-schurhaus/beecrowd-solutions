import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] entrada = br.readLine().trim().split(" ");
        float nota1 = Float.parseFloat(entrada[0]);
        float nota2 = Float.parseFloat(entrada[1]);
        float nota3 = Float.parseFloat(entrada[2]);
        float nota4 = Float.parseFloat(entrada[3]);

        float media = (2 * nota1 + 3 * nota2 + 4 * nota3 +  nota4) /  10.0f;
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0f) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0f) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            float notaExame = Float.parseFloat(br.readLine());
            System.out.printf("Nota do exame: %.1f%n", notaExame);

            media = (media + notaExame) / 2.0f;

            if (media >= 5.0f) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", media);
        }
    }
}
