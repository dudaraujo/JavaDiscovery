public class Conta {

        public String titularConta;
        public int  saldoConta;
        public String tipoConta;


        public void exibeSaldo() {
            System.out.println("O saldo da sua conta é: " + saldoConta);
        }
        private int recebeTransferencia(int valor) {

            saldoConta += valor;
            System.out.println("O saldo atualizado da conta é: " + saldoConta);

            return saldoConta;
        }

        public static void fazTranfencia () {

        }

        public static void enviaPix () {

        }

        public static void fazPix () {

        }
    }

