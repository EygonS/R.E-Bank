import java.util.Scanner;

public abstract class Doar extends Organizacional implements Doacao {


    @Override
    public void doacao() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Gostaria de fazer uma doação");
        String resposta = entrada.next();
        if (resposta.equalsIgnoreCase("sim")) {

            System.out.println("Quantia para doação");
            double doa = entrada.nextDouble();

            System.out.println("Obrigado pela doação");
            transferir(cpfSelecionado, doa);
        }else if (resposta.equalsIgnoreCase("nao")){
            System.out.println("Obrigado, tenha um bom dia ");
        }
    }
}
