import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int userNumber;

        System.out.println("""
                ================================================
                        Bem vindo ao jogo da advinhação
                Tente acertar advinhar um número entre 0 e 100
                            Você tem 5 tentativas... :)
                ================================================
                """);

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Tentativa: "+ i +"/5");
            System.out.print("Digite um número entre 0 e 100 => ");
            userNumber = scanner.nextInt();

            if(userNumber > randomNumber){

                System.out.printf("O número %d é MAIOR que o valor gerado...%n", userNumber);

            }else if(userNumber < randomNumber){

                System.out.printf("O número %d é MENOR que o valor gerado...%n", userNumber);

            } else {
                System.out.println("PARABENS VOCÊ ACERTOU!!!");
                System.out.println("Numero de tentativas: "+ i);
                return;

            }


        }

    }
}