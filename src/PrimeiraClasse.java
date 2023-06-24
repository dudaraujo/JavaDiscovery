public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Concluí a aula 01 e agora estou mergulhando em Java!");
        System.out.println("------------------------------------------");

        System.out.println("Convertendo graus Celsius para Fahrenheit");
        double grausCelcius = 27.5;
        double grausFahrenheit = (grausCelcius * 1.8) + 32;
        System.out.println(String.format("A temperatura de %f graus Celsius é equivalente a %f graus Fahrenheit", grausCelcius, grausFahrenheit));

        int fahrenheitInt = (int) grausFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é " + fahrenheitInt);
    }
}