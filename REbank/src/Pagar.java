import java.util.Scanner;

public class Pagar extends Organizacional{

    public void pagarBoleto() throws ExceptionBoleto{
        System.out.println("Digite o numero do boleto");
        Scanner leituraBoleto = new Scanner(System.in);
        String numerosBoleto = leituraBoleto.next();

        if (!numerosBoleto.matches("[+-]?\\d*(\\.\\d+)?")){
            throw new ExceptionBoleto();
        }
        String[] oi = numerosBoleto.split("");
        int numsFinais = Integer.parseInt(oi[8] + oi[9] + oi[10] + oi[11]);
        System.out.println(numsFinais);


        transferir(cpfSelecionado, numsFinais);


        //tem q diminuir no saldo




    }
}
