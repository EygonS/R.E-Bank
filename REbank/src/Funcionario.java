public abstract class Funcionario extends Filial {
   protected String nomeFuncioanrio = "Cleiton";

//        construtor de sobreposição para se o funcionario for da sua filial

   public void informacaoFuncionario(){
      informacoesFilial();
      System.out.println("Nome do funcionario" + nomeFuncioanrio);
   }

   public String getNomeFuncioanrio() {
      return nomeFuncioanrio;
   }

   public void setNomeFuncioanrio(String nomeFuncioanrio) {
      this.nomeFuncioanrio = nomeFuncioanrio;
   }

   //fazer  get e set desse nomFuncionario
}
