package syntax;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        System.out.println(randomNumber);
        int count = 0;

        while( count < 5 ) {
            System.out.println("Adivinhe o número de 0 a 100");
            int guess = read.nextInt();
            count++;

            if(guess == randomNumber) {
                System.out.println("Parabéns! Você acertou o número!");
                break;
            } else if (guess > randomNumber) {
                System.out.println("O número digitado é maior que o número correto.");
            } else {
                System.out.println("O número digitado é menor que o número correto.");

            }

        }
        if(count == 5) {
            System.out.println("Suas tentativas acabaram. O número correto era " + randomNumber);
        }





    }
}
