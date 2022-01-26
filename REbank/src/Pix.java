import java.util.Scanner;

public abstract class Pix extends Organizacional{ // extends Cliente implements Tansferencia

    public static void fazerPix(String cpf1, String cpf2, double valor){
        //transferir de um pix pro outro.
        //fazer um scanner pra ler o segundo cpf.
        // depois transferir.
    }





    //conferir limite
    //trasferir


//    private double limitePix = getSaldo();
//    private String chaveAleatoria;
//
//    Scanner entrada = new Scanner (System.in);
//
//    public void tranferirPix(){
//        System.out.println ("Informe a quantidade de dinheiro a ser transferida");
//        double trans = entrada.nextDouble ();
//
//        if(trans > Double.parseDouble(saldo)){
//            System.out.println("Você não possue essa quantidade, por favor diminua o valor");
//        }
//        System.out.println ("qual o tipo");
//        System.out.println("1 - CPF, 2 - Nome, Numero");
//        int tipo = entrada.nextInt ();
//        if(tipo == 1){
//            System.out.println ("informe a chave");
//            double chave = entrada.nextDouble ();
//
//        }else if(tipo == 2){
//
//        }else if(tipo == 3){
//
//        }
//
//                //colocar leitura de arquivo para ter o nome da pessoas
//    }
//
//
//    @Override
//    public void transferir () {
//
//        System.out.println ("Vaalor da transferencia com tarifa de 10 reais ");
//        double qtdtrans = entrada.nextDouble () + 10;
//
//        if (getLimite() > qtdtrans){
//            if (this.getSaldo() > qtdtrans) {
//                System.out.println ("valer final a ser transferido:" + qtdtrans);
//                System.out.println ("Concorda com essa transação");
//                String resposta = entrada.next ();
//                if(resposta.equals ("sim")) {
//                    setSaldo(String.valueOf((getSaldo()-qtdtrans)));
//                    System.out.println ( "Transferencia concluida com sucesso" );
//                }else if(resposta.equals ("nao")) {
//                    System.out.println ("Transação cancelada");
//                }
//                //COLOCAR TRATAMENTO PARA NUMERO*
//            }
//        }else if(getLimite() < qtdtrans) {
//            System.out.println ("Essa transferencia está passando do limite definido");
//        }
//    }
//
//    public void depositar () {
//        System.out.println("Qual a sua quantia de deposito?");
//        double deposito = entrada.nextDouble ();
//
//        if (getLimite() > deposito){
//            System.out.println ("Você deseja continuar com a operação ? ");
//            String confirmar = entrada.next ();
//
//            if (confirmar.equals ("sim")){
//                System.out.println ("deposito feito com sucesso");
//                System.out.println ("Agora você possui na sua conta: " + saldo + deposito);
//
//                saldo += deposito;
//            } else if (confirmar.equals ("nao")){
//                System.out.println ("Deposito cancelado");
//            }
//        }
//    }
//
//    public void doacao () {
//        System.out.println ("Quantia para doação");
//        double doa = entrada.nextDouble();
//
//        System.out.println ("Obrigado pela doação");
//        setSaldo(String.valueOf((getSaldo()-doa)));
//    }
//
//
//
//
}
