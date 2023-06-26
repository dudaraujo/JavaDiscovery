package syntax;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        double ratingAverage = 0;
        double evaluation = 0;
        int count = 0;

        while (evaluation != -1) {
            System.out.println("Digite sua avaliação do filme ou -1 para encerrar");
            evaluation = read.nextDouble();

            if(evaluation != -1) {
                ratingAverage += evaluation;
                count++;
            }

        }

        System.out.println("Nota do filme: " + ratingAverage / count);
    }
}
