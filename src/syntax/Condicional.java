package syntax;

public class Condicional {
    public static void main(String[] args) {
        int releaseYear = 2022;
        boolean includedPlan = false;
        double ratingMovie = 8.5;
        String planType = "plus";

        if (releaseYear >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retrô qu vale a pena assistir!");
        }

        if (includedPlan || planType.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Apenas aluguel");
        }



    }
}
