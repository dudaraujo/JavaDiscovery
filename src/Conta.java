public class Conta {

        public String titularConta;
        public int  saldoConta;
        public String tipoConta;


        public void exibeSaldo() {
            System.out.println("O saldo da sua conta é: " + saldoConta);
        }
        public int recebeTransferencia(int valor) {

            saldoConta += valor;
            System.out.println("O saldo atualizado da conta é: " + saldoConta);

            return saldoConta;
        }

        public int fazTranfencia (int valor) {

            if(saldoConta > valor) {
                saldoConta -= valor;
                System.out.println("O saldo atualizado da sua conta é: " + saldoConta);

            } else {
                System.out.println("Não há saldo sulficiente para realizar essa transferência");
            }
            return saldoConta;
        }

        public static void enviaPix () {

        }

        public static void fazPix () {

        }
    }

