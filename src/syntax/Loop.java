package syntax;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double ratingAverage = 0;
        double evaluation = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite a nota do filme");
            evaluation = read.nextDouble();
            ratingAverage += evaluation;

        }

        System.out.println("Nota do filme: " + ratingAverage / 3);

    }
}
