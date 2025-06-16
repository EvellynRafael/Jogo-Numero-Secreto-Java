import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int numDigitado = 0;
        System.out.println("Bem vindo ao jogo do número secreto. " +
                "Atenção! Você só tem 5 chances"
        );

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numDigitado = leitura.nextInt();
            tentativas++;

            if (numDigitado == numeroAleatorio){
                System.out.println("Parabéns, você achou o número aleatório em: " + tentativas + " tentativas");
                break;
            } else if (numDigitado > numeroAleatorio) {
                System.out.println("O número secreto é menor!");
            } else {
                System.out.println("O número secreto é maior!");
            }
        }

        if (tentativas == 5 && numDigitado != numeroAleatorio){
            System.out.println("Suas tentativas acabaram! O número secreto era: " + numeroAleatorio);
        }

    }
}
