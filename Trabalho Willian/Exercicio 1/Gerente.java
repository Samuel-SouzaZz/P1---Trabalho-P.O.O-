public class Gerente extends Funcionarios{
   
   private int quantidadeFuncionariosGerenciados;
   private String senha;
   
   public Gerente(){
      super();
   }
   public Gerente(String nome,String cpf, double salario, int quantidadeFuncionariosGerenciados, String senha){
      super(nome,cpf,salario);
      this.quantidadeFuncionariosGerenciados = quantidadeFuncionariosGerenciados;
      this.senha = senha;
   }
   
   public int getQuantidadeFuncionariosGerenciados(int quantidadeFuncionariosGerenciados){
      return quantidadeFuncionariosGerenciados;
   }
   public void setQuantidadeFuncionariosGerenciados(int quantidadeFuncionariosGerenciados){
      this.quantidadeFuncionariosGerenciados = quantidadeFuncionariosGerenciados;
   }
}