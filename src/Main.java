
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Scren Match");
        System.out.println("Filme: Top Gun: Maverick");

        int releaseYear = 2022;
        System.out.println("Ano de Lançamento: " + releaseYear);
        boolean includedPlan = false;
        System.out.println("Incluído no Plano?: " + includedPlan);
        double ratingMovie = 8.5;
        System.out.println("Avaliação do Filme: " + ratingMovie);
        String synopsis = """
                          Filme de aventura com galã dos anos 80
                          Ganhador do Oscar de melhor filme de tiros!
                          
                          """;

        System.out.println("Sinopse: " + synopsis);
        System.out.println("//-------------------------------------------------------//");

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));


    }
}