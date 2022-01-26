import java.util.Random;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Cobrar {
    int max = 99999999;
    int min =  10000000;

    // gera um numero de 12 caracteres para colocar apos o valor
    public void gerarBoleto(){

        System.out.println("Quanto você quer cobrar?");
        Scanner cobranca = new Scanner(System.in);
        int valorboleto = cobranca.nextInt();

        int nF = valorboleto;
        Random rnd = new Random();
        String opa = String.valueOf(rnd.nextInt(max-min+1)+min) + String.valueOf(nF);
        System.out.println(opa);
        String[] oi = opa.split("");
        int numsFinais = Integer.parseInt(oi[8] + oi[9] + oi[10] + oi[11]);
        //System.out.println(numsFinais);
        System.out.println("Mande o esse numero para quem você quer cobrar");

    }
}
