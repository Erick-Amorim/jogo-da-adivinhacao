import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroDigitado;

        for (int tentativas = 0; tentativas < 4; tentativas++) {
            System.out.println("Digite o número: ");
            numeroDigitado = leitura.nextInt();

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Você adivinhou, parabéns !");
                break;
            }   else {
                System.out.println("Você digitou o número " + numeroDigitado);
                if (numeroDigitado < numeroAleatorio) {
                    System.out.println("O número digitado é menor que o número aleatório");
                }   else {
                    System.out.println("O número digitado é maior que o número aleatório");
                }
            }
        }

        System.out.println("O número aleatório é o " + numeroAleatorio);

    }
}