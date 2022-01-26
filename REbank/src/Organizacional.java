import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Organizacional implements Tansferencia{
    ArrayList<Cliente> clientesArray = new ArrayList<>();

    public void gerenciamento(String cpf) {
        try {
            FileReader arquivo = new FileReader("Teste1.csv");

            BufferedReader leitorArquivo = new BufferedReader(arquivo);
            String leitor;
boolean i = false;
            try {
                leitor = leitorArquivo.readLine();//ler a primeira linha
                while (leitor != null) {
                    String[] dados = leitor.split(",");
                    Cliente cliente = new Cliente();

                    cliente.setCpf(dados[0]);
                    cliente.setNumero(dados[1]);
                    cliente.setSaldo(dados[2]);
                    cliente.setLimite(dados[3]);
                    cliente.setSenha(dados[4]);
                    cliente.setNumeroDaConta(dados[5]);
                    cliente.setNome(dados[6]);
                    cliente.setEmail(dados[7]);
                    if(cliente.cpf.equals(cpf)){
                        break;
                    }

                    clientesArray.add(cliente);

                    leitor = leitorArquivo.readLine();
                    i=true;
                }

                arquivo.close();
            } catch (IOException e) {
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    int i;
    boolean conferirSeExisteCpf;
    String cpfSelecionado;
    public void conferirSeExisteCpf(String cpf) {
        conferirSeExisteCpf = false;
        gerenciamento(cpf);
        i = 0;
        for (Cliente c : clientesArray){
            if (Objects.equals(c.getCpf(), cpf)){
                conferirSeExisteCpf = true;
                cpfSelecionado = c.getCpf();
                break;
            } else {
                conferirSeExisteCpf = false;
            }
            i++;
        }
    }

    @Override
    public void transferir(String cpf1, String cpf2, double valor) {
        conferirSeExisteCpf(cpf1);
        if (conferirSeExisteCpf) {
            int posCpf1 = i;
            if (clientesArray.get(posCpf1).getSaldo() >= valor){
                conferirSeExisteCpf(cpf2);
                if (conferirSeExisteCpf){
                    int posCpf2 = i;

                    clientesArray.get(posCpf1).setSaldo(String.valueOf(clientesArray.get(posCpf1).getSaldo()-valor));
                    clientesArray.get(posCpf2).setSaldo(String.valueOf(clientesArray.get(posCpf2).getSaldo()+valor));
                    System.out.println("Transaferencia Realizada com sucesso");

                } else {
                    System.out.println("CPF não encontrado");
                }
            } else {
                System.out.println("saldo insuficiente");
            }
        } else {
            System.out.println("CPF não encontrado");
        }
    }

    @Override
    public void transferir(String cpf1, double valor) {
        conferirSeExisteCpf(cpf1);
        if (conferirSeExisteCpf) {
            int posCpf1 = i;
            if (clientesArray.get(posCpf1).getSaldo() >= valor){
                clientesArray.get(posCpf1).setSaldo(String.valueOf(clientesArray.get(posCpf1).getSaldo()-valor));
            } else {
                System.out.println("saldo insuficiente");
            }
        } else {
            System.out.println("CPF não encontrado");
        }
    }
}


