public abstract class Filial {//extends Banco

    private int numFilial = 1001;
    private String localFilial = "Rua jose Bastos";
    private String horarioFuncionamento = "8h as 18h";



    public void informacoesFilial(){
        System.out.println("Sua filial é: " + numFilial);
        System.out.println("Localizacao da sua filial:" + localFilial);
        System.out.println("Atendimento de " + horarioFuncionamento);
    }



    public int getNumFilial() {
        return numFilial;
    }

    public void setNumFilial(int numFilial) {
        this.numFilial = numFilial;
    }

    public String getLocalFilial() {
        return localFilial;
    }

    public void setLocalFilial(String localFilial) {
        this.localFilial = localFilial;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }
}
