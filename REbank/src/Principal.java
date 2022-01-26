import java.util.Scanner;

public class Principal {


    public static void main(String[] args) throws ExceptionBoleto {
        System.out.println("RE Bank da uma re nas suas dívidas e um up em seus lucros");
        Scanner entrada = new Scanner(System.in);
        Organizacional organizacional = new Organizacional();
        do {
            System.out.println("Qual o seu CPF");
            String entradaCPF = entrada.next();
            try {
                organizacional.conferirSeExisteCpf(entradaCPF);
                if(!organizacional.conferirSeExisteCpf) {
                    throw new ErroNoLogin();
                }
            } catch (ErroNoLogin e) {
                System.out.println(e.getMessage());
            }
        }while (!organizacional.conferirSeExisteCpf);
        //String cpfLogado = organizacional.cpfSelecionado;

boolean i = true;
while (i = true) {
    System.out.println("1 para pix; 2 para pagar; 3 para cobrar; 4 para recarregar celular;");
    System.out.println("5 para informacoes; 6 para falar com funcionario; 7 para acabar");

    String numeroEscolhido = entrada.next();


    if (numeroEscolhido.equals("1")) {
        System.out.println("Pix");


    } else if (numeroEscolhido.equals("2")){
        System.out.println("Pagamento");
        Pagar pagar = new Pagar();
        pagar.pagarBoleto();

    } else if (numeroEscolhido.equals("3")) {
        System.out.println("Cobrança");
        Cobrar cobrar = new Cobrar();
        cobrar.gerarBoleto();

    } else if (numeroEscolhido.equals("4")) {
        System.out.println("Recarga Celular");
        RecargaCelular recargaCelular = new RecargaCelular();
        recargaCelular.recarregarCelular(recargaCelular.cpfSelecionado);


    } else if (numeroEscolhido.equals("5")) {
        System.out.println("Informação");
        System.out.println(organizacional.cpfSelecionado);

    } else if (numeroEscolhido.equals("6")) {
        System.out.println("Chamar Funcionario");
        Funcionario funcionario = new Funcionario(){};
        funcionario.informacaoFuncionario();

    } else if (numeroEscolhido.equals("7")) {
        i = false;
        break;
    }
}


//        String cpf1 = null;
//        String cpf2 = null;
//        double valor = 0;
//        int operacao;

        //Scanner cpfDoCliente = new Scanner(System.in);
        //****************************************************
//        Organizacional organizacional = new Organizacional();
//        organizacional.gerenciamento();
//        organizacional.conferirSeExisteCpf("15824578364");
//
//        Cobrar cobrar = new Cobrar();
//        cobrar.gerarBoleto();


        //pede cpf
        // chama conferir cpf
        // cpf1 = cpf encontrado

//


//        boolean aTaCerto;
//        do {
//            System.out.println("Teste");
//            int a = entrada.nextInt();
//            try {
//                if (a > 10) {
//                    throw new ExceptionBoleto();
//                }
//                System.out.println("valor de a é - " + a);
//                aTaCerto = true;
//            } catch (ExceptionBoleto e) {
//                System.out.println(e.getMessage());
//                aTaCerto = false;
//            }
//        } while (!aTaCerto);





      //  try {
      //    Pagar.pagarBoleto();
      //} catch (ExceptionBoleto e) {
      //  e.printStackTrace();
      //}

       // System.out.println("continua normal");


        //Pix.fazerPix(cpf1,cpf2,valor);


//        String nome = "Eygon";
//        int saldo = 4000;
//        int limiteCartão = 8000;
//        String email = "eygon11@gmail.com";


//        boolean i = true;
//        while (i = true){
//            System.out.println("ola " + nome);
//            System.out.println("O quer você quer fazer");
//            System.out.println("Digite: 1 para pix, 2 para tranferencia, 3 informações ");
//
//            Scanner prompt = new Scanner(System.in);
//            String entradaMain = prompt.next();
//
//            if (entradaMain == "1"){
//
//            }
//
//        }


    }


}