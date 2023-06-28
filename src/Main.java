import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int comando;

        Conta conta1 = new Conta();

        System.out.println("Digite seu nome: ");
        conta1.titularConta = read.nextLine();

        System.out.println("Digite o tipo de conta que você deseja abrir: ");
        conta1.tipoConta = read.nextLine();

        System.out.println("Digite seu saldo inicial: ");
        conta1.saldoConta = read.nextInt();

        String mensagem = """
                  ***********************
                  Olá, %s!
                  Boas vindas a sua conta %s.
                  Seu saldo inicial é de %d reais!
                  ***********************
                  
                  Por favor, selecione uma das opções abaixo:
                               
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                                  
                  """.formatted(conta1.titularConta, conta1.tipoConta, conta1.saldoConta);

        System.out.println(mensagem);
        comando = read.nextInt();


        if(comando == 1) {
            conta1.exibeSaldo();

        } else if (comando == 2) {
            System.out.println("Quanto você gostaria de receber?");
            int valor = read.nextInt();
            conta1.recebeTransferencia(valor);

        } else if (comando == 3 ) {
            System.out.println("Quanto você gostaria de transferir");
            int valor = read.nextInt();
            conta1.fazTranfencia(valor);

        } else {
            System.out.println("Valor inválido");

        }


    }
}