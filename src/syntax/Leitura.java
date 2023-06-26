package syntax;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); //maps keyboard changes

        System.out.println("Digite seu filme favorito");
        String movie = read.nextLine(); // nextLine is used for strings

        System.out.println("Digite o ano de lançamento do filme");
        int releaseYear = read.nextInt();

        System.out.println("Digite sua avaliação para o filme");
        double ratingMovie = read.nextDouble();

        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(ratingMovie);
    }
}
