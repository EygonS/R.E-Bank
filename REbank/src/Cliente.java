public class Cliente { //extends Banco implements Deposito

   protected String cpf;
   protected String numero;
   protected String saldo;
   protected String limite;
   protected String senha;
   protected String numeroDaConta;
   protected String nome;
   protected String email;

   public String getCpf() {
      return cpf;
   }

   public void setCpf(String cpf) {
      this.cpf = cpf;
   }

   public String getNumero() {
      return numero;
   }

   public void setNumero(String numero) {
      this.numero = numero;
   }

   public double getSaldo() {
      return Double.parseDouble(saldo);
   }

   public void setSaldo(String saldo) {
      this.saldo = saldo;
   }

   public double getLimite() {
      return Double.parseDouble(limite);
   }

   public void setLimite(String limite) {
      this.limite = limite;
   }

   public String getSenha() {
      return senha;
   }

   public void setSenha(String senha) {
      this.senha = senha;
   }

   public String getNumeroDaConta() {
      return numeroDaConta;
   }

   public void setNumeroDaConta(String numeroDaConta) {
      this.numeroDaConta = numeroDaConta;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Override
   public String toString() {
      return "Cliente{" +
              "cpf='" + cpf + '\'' +
              ", numero='" + numero + '\'' +
              ", saldo='" + saldo + '\'' +
              ", limite='" + limite + '\'' +
              ", senha='" + senha + '\'' +
              ", numeroDaConta='" + numeroDaConta + '\'' +
              ", nome='" + nome + '\'' +
              ", email='" + email + '\'' +
              '}';
   }
}
