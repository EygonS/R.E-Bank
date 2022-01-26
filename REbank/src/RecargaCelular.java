import java.util.Scanner;

public class RecargaCelular extends Organizacional {

    public void recarregarCelular(String cpf) {
        System.out.println("O nomero a recarregar é o seu numero?");

        Scanner seuNumero = new Scanner(System.in);
        String simOunão = seuNumero.next();

        if (simOunão.equals("sim")) {
            //pegar numero do usuario
        } else {
            System.out.println("digite o numero");
            Scanner numeroARecarregar = new Scanner(System.in);
            String numeroParaRecarregar = numeroARecarregar.next();
        }

        boolean i = true;

        while (i == true) {
            System.out.println("Valor da recarga (12, 30, 40, 50, 60)");
            Scanner valorDaRecarga = new Scanner(System.in);
            String valorEscolhido = valorDaRecarga.next();

            if (valorEscolhido.equals("12")) {
                //diminuie 12 do saldo
                transferir(cpf, 12);
                i = false;
                break;
            } else if (valorEscolhido.equals("30")) {
                //diminuie 30 do saldo
                transferir(cpf, 30);
                i = false;
                break;
            } else if (valorEscolhido.equals("40")) {
                //diminuie 40 do saldo
                transferir(cpf, 40);
                i = false;
                break;
            } else if (valorEscolhido.equals("50")) {
                //diminuie 50 do saldo
                transferir(cpf, 50);
                i = false;
                break;
            } else if (valorEscolhido.equals("60")) {
                //diminuie 60 do saldo
                transferir(cpf, 60);
                i = false;
                break;
            } else {
                System.out.println("Escolha um valor entre as opções");
            }
        }


    // diminuir o valor q vc escolheu da sua conta
}
}
